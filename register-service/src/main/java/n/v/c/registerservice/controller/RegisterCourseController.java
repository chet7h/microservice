package n.v.c.registerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RegisterCourseController {

    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/register")
    public String index(){
        return restTemplate.getForObject("http://course-service/course/", String.class);
        
    }
}
