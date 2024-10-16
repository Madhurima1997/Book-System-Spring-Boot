package com.book.bms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/api/greet") // Define the endpoint
    public String greet() {
        return "HI"; // Return the greeting message
    }

}
