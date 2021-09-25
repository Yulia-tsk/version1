package org.animalsaidv1.version1.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @PostMapping("/persons")
    public Person person(@RequestBody Person person){
        return personService.addNewPerson(person);
    }

    @GetMapping("/persons/{id}")
    public Optional<Person> getPersonById(@PathVariable long id){
        return personService.getPersonById(id);
    }
}
