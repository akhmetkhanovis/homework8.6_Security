package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("hello")
    public String helloForEveryone() {
        return "Hello, User!";
    }

    @GetMapping("hello2")
    public String helloForAuthorized() {
        return "Hello, authorized User!";
    }
}
