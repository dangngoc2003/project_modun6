package com.example.demo.service;

import com.example.demo.model.Wallet;

import java.util.List;

public interface ICrudWallet {
    List<Wallet> findAll();
    Wallet findOne(Long id);
    void save(Wallet wallet);
    void delete(Long id);

}
