package org.animalsaidv1.version1.donation;


import org.animalsaidv1.version1.person.Person;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Currency;

@Entity
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long donationId;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "person_id")
    private Person person;
//    private LocalDate donationDate; // in constructor later change to the date of payment (after having integrated this with paypal
    private LocalDate now;
//    private Period period;
    private boolean isSuccess;
//    private Currency currency;

    public Donation() {
    }

    public Donation(long personId) {
        this.person = new Person(personId, "");
        person.setActive(true);
    }

    public Donation(long donationId, LocalDate donationDate, LocalDate now, Period period, boolean isSuccess, long personId) {
        this.donationId = donationId;
        //        this.donationDate = donationDate;
        this.now = LocalDate.now();
//        this.period = period;
        this.isSuccess = isSuccess;
        this.person = new Person(personId, "");
    }

    public long getDonationId() {
        return donationId;
    }

    public void setDonationId(long donationId) {
        this.donationId = donationId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

//    public LocalDate getDonationDate() {
//        return donationDate;
//    }

//    public void setDonationDate(LocalDate timeOfDonation) {
//        this.donationDate = timeOfDonation;
//    }

    public LocalDate getNow() {
        return now;
    }

    public void setNow(LocalDate now) {
        this.now = LocalDate.now();
    }

//    public Period getPeriod() {
//        return period;
//    }
//
//    public void setPeriod(Period period) {
//        this.period = period;
//    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void makeDonation(double sum){
        Donation donation = new Donation();
        if(sum <10) {
            LocalDate donationDate = LocalDate.now();
            donation.setSuccess(true);
        }

    }

    public void checkDonationDateAndSetPersonStatus(Person person, LocalDate now,LocalDate donationDate)
    {
        if(isSuccess){
            person.isActive(true);
        }else {
            System.out.println("not active...");
        }
    }
 public void payDonation(Currency currency){
        currency.getCurrencyCode();
 }
}
