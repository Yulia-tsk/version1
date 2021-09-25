package org.animalsaidv1.version1.photo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends CrudRepository<Photo, Long> {
    public List<Photo> findPhotoByAnimalId(long id);

}
