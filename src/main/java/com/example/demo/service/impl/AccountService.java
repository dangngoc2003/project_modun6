package com.example.demo.service.impl;

import com.example.demo.model.account.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.ICrudAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountService implements ICrudAccount {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findOne(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Account account) {
        accountRepository.save(account);

    }

    @Override
    public void delete(Long id) {
    accountRepository.deleteById(id);
    }

    @Override
    public Account login(String username, String password) {
        return   accountRepository.findByUsernameAndPassword(username,password);

    }
}
