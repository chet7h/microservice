package n.v.c.courseservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CourseController {

    @GetMapping("/course")
    public String index() {
        return "ddd";
    }
}
