package org.animalsaidv1.version1.photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotoController {
    @Autowired
    PhotoService photoService;

    @GetMapping("/animals/{animalId}/photos")
    public List<Photo> getPhotosByAnimalId(@PathVariable long id){
        return photoService.getPhotosByAnimalId(id);
    }

}
