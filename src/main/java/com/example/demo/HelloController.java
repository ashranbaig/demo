package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi()
    {
        return "Hi! I am Ashran Baig";

    }

}
