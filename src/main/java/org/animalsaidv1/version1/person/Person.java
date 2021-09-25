package org.animalsaidv1.version1.person;

import com.sun.istack.NotNull;

import org.animalsaidv1.version1.animals.Animal;
import org.animalsaidv1.version1.donation.Donation;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
@Email
    private String email;
@NotNull
    @Size(min=10,max=10)
    private String phone;
    private String photo;
    private boolean isActive;
    private String password;
    private String address;
 @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private Set<Animal> myAnimals;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private List<Donation> myDonations;

    public Person() {
    }

    public Person(Long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
    public Person(Long id, String firstName, boolean isActive) {
        this.id = id;
        this.firstName = firstName;
        this.setActive(true);
    }

    public Person(Long id, String firstName, String lastName, String email, String phone, String photo, boolean isActive, String password, String address, Set<Animal> myAnimals, List<Donation> myDonations) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.photo = photo;
        this.isActive = isActive;
        this.password = password;
        this.address = address;
        this.myAnimals = myAnimals;
        this.myDonations = myDonations;
    }

    public Long getId() {
        return id;
    }



//    public void setId(Long id) {
//        this.id = id;
//    }


    public boolean isActive() {
        return isActive;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Animal> getMyAnimals() {
        return myAnimals;
    }

    public void setMyAnimals(Set<Animal> myAnimals) {
        this.myAnimals = myAnimals;
    }

    public List<Donation> getMyDonations() {
        return myDonations;
    }

    public void setMyDonations(List<Donation> myDonations) {
        this.myDonations = myDonations;
    }

    public boolean isActive(boolean b) {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", isActive=" + isActive +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", myAnimals=" + myAnimals +
                ", myDonations=" + myDonations +
                '}';
    }
}
