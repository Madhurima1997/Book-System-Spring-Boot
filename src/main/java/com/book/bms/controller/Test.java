package com.book.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.bms.model.Category;
import com.book.bms.service.CategoryService;

@RestController
public class Test {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/api/greet") // Define the endpoint
    public String greet() {
        return "HI"; // Return the greeting message
    }

    @GetMapping("/api/allCategories")
    public List<Category> allCategories() {
        return categoryService.getAllCategories();
    }

}
