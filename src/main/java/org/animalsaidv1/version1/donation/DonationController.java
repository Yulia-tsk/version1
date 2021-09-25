package org.animalsaidv1.version1.donation;


import org.animalsaidv1.version1.person.Person;
import org.animalsaidv1.version1.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DonationController {
@Autowired
    DonationService donationService;
@Autowired
PersonService personService;
@PostMapping("/persons/{personId}/donation")
public Donation addDonation(@RequestBody Donation  donation, @PathVariable long  personId){
double sum = 0;
//LocalDate localDate = new LocalDate.now();
    //donation.setPerson(new Person(personId, "", true));
Person person = personService.getPersonByPersonId(personId);
person.setActive(true);
personService.updatePerson(person);
//personService.save(person);
    donation.makeDonation(sum);

    donation.setSuccess(true);


    return donationService.addDonation(donation);
}

@GetMapping("/persons/{personId}/donations")
    public List<Donation> getMyDonations(@PathVariable long personId){
    return donationService.getDonationsByPersonId(personId);
}

}
