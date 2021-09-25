package org.animalsaidv1.version1.photo;



import org.animalsaidv1.version1.animals.Animal;

import javax.persistence.*;

@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String link;
    private PhotoSize photosize;
    @ManyToOne(targetEntity = Animal.class)
    @JoinColumn(name = "animal_id")
    private Animal animal;

    public Photo() {
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Photo(Animal animal) {
        this.animal = animal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public PhotoSize getPhotosize() {
        return photosize;
    }

    public void setPhotosize(PhotoSize photosize) {
        this.photosize = photosize;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", photosize=" + photosize +
                '}';
    }
}

enum PhotoSize {
    LARGE, MEDIUM, SMALL, THUMBNAIL
}
