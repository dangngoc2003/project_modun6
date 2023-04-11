package com.example.demo.service;



import com.example.demo.model.account.Account;

import java.util.List;

public interface ICrudAccount {
    List<Account> findAll();
    Account findOne(Long id);
    void save(Account account);
    void delete(Long id);
    Account login(String username,String password);
}
