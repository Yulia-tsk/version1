package org.animalsaidv1.version1.animals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    public List<Animal> findAnimalByPersonId(long personId);
}
