package com.example.demo.service;

import com.example.demo.model.Plan;
import com.example.demo.model.WalletCategory;

import java.util.List;

public interface ICrudWalletCategory {
    List<WalletCategory> findAll();
    WalletCategory findOne(Long id);
    void save(WalletCategory walletCategory);
    void delete(Long id);
}
