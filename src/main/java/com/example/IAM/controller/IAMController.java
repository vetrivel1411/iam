package com.example.IAM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IAMController {

    @GetMapping("/IAM")
    public String sayHello() {
        return "Welcome to IAM Service";
    }
}
