package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Plan;

import java.util.List;

public interface ICrudCategory {
    List<Category> findAll();
    Category findOne(Long id);
    void save(Category category);
    void delete(Long id);
}
