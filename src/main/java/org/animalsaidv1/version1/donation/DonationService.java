package org.animalsaidv1.version1.donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DonationService {

@Autowired
    DonationRepository donationRepository;

public Donation addDonation(Donation donation){

    /* call api to make payment, get 200OK status, write if statement */

        return donationRepository.save(donation);


}


    public List<Donation> getDonationsByPersonId(long personId) {

    List<Donation> myDonations = new ArrayList<Donation>(donationRepository.findAllByPersonId(personId));

    return myDonations;


    }
}
