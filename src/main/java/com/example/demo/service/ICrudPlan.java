package com.example.demo.service;

import com.example.demo.model.Cash;
import com.example.demo.model.Plan;

import java.util.List;

public interface ICrudPlan {
    List<Plan> findAll();
    Plan findOne(Long id);
    void save(Plan plan);
    void delete(Long id);

}
