package org.animalsaidv1.version1.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List getAllPersons(){

        List<Person> persons = new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    public Person addNewPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    public Optional<Person> getPersonById(long id) {
        Optional<Person> person =  personRepository.findById(id);
        return person;

    }

    public Person getPersonByPersonId(long id) {
        Person person = personRepository.findPersonByPersonID(id);
        return person;
    }
public void updatePerson(Person person){
        personRepository.save(person);
}
//public int setFixedActiveFor(long id){
//        return personRepository.setFixedActiveFor(id);
//}
}
