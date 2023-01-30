package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuguangwei
 * @date 2023-01-30
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @RequestMapping("/world")
    public String helloWorld() {
        return "Hello World !";
    }

}
