package com.book.bms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bms.model.Category;
import com.book.bms.repository.CategoryRepository;
import com.book.bms.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepo;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.getAllCategories();
    }
    
}
