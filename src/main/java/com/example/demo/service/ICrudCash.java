package com.example.demo.service;

import com.example.demo.model.Cash;
import com.example.demo.model.Wallet;

import java.util.List;

public interface ICrudCash {
    List<Cash> findAll();
    Cash findOne(Long id);
    void save(Cash cash);
    void delete(Long id);

}
