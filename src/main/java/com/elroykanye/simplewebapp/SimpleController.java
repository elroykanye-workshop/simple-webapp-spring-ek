package com.elroykanye.simplewebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Spring!";
    }
}
