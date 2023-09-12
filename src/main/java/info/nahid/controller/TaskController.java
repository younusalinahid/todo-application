package info.nahid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/test")
    public String getTest () {
        return "Hello world";
    }

}
