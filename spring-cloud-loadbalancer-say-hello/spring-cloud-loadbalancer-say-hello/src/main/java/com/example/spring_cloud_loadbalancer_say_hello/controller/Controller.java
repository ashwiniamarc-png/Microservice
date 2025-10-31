package com.example.spring_cloud_loadbalancer_say_hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acc")
public class Controller {
	
	@PostMapping("/greeting")
    public String greetPost() {
        System.out.println("Accessed POST /acc/greeting");
        return "Thank you (POST)!";
    }

    @GetMapping("/greeting")
    public String greetGet() {
        System.out.println("Accessed GET /acc/greeting");
        return "Hello from GreetingController (GET)!";
    }
}
