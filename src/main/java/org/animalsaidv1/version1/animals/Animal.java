package org.animalsaidv1.version1.animals;
import org.animalsaidv1.version1.person.Person;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    private String description;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String breed;
    private String health;
    private LocalDate birthDate;
    private LocalDate sterilisationDate;
    private String photo;

    private boolean isHomeNeeded = false;

    @ManyToOne(targetEntity = Person.class, fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "person_id")
    private Person person;


    //Getters, setters, constructors


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Animal() {
    }


    public Animal(long id, String name, String description, Gender gender,
                  LocalDate birthDate, String photo,
                  boolean isHomeNeeded, long personId,
                  LocalDate sterilisationDate, String health, String breed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.gender = gender;
        this.birthDate = birthDate;
        this.photo = photo;
        this.isHomeNeeded = isHomeNeeded;
        this.person = new Person(personId, "");
        this.sterilisationDate = sterilisationDate;
        this.breed = breed;
        this.health = health;
    }

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getSterilisationDate() {
        return sterilisationDate;
    }

    public void setSterilisationDate(LocalDate sterilisationDate) {
        this.sterilisationDate = sterilisationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", health='" + health + '\'' +
                ", birthDate=" + birthDate +
                ", sterilisationDate=" + sterilisationDate +
                ", photo='" + photo + '\'' +
                ", isVisible=" + isHomeNeeded +
                ", person=" + person +
                '}';
    }
}

enum Gender {
    MALE, FEMALE
}

