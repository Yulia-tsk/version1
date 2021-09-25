package org.animalsaidv1.version1.photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhotoService {
    @Autowired
    PhotoRepository photoRepository;

    public List<Photo> getPhotosByAnimalId(long id){
        List<Photo> photos = new ArrayList<>();
        photoRepository.findPhotoByAnimalId(id).forEach(photos::add);
        return photos;
    }

}
