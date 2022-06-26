package hello.mystudy.spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {

    @GetMapping("/study")
    public String study() {
        return "Hello";
    }
}
