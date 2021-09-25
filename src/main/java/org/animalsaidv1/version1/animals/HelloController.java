package org.animalsaidv1.version1.animals;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello friend";
    }
}
