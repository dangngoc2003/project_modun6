package com.example.demo.controller;

import com.example.demo.account.Account;
import com.example.demo.service.ICrudAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/account")
public class AccountController {
    @Autowired
    ICrudAccount crudAccount;
    @GetMapping
    private ResponseEntity<List<Account>> findAll(){
        return new ResponseEntity<>(crudAccount.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<Account> findOne(@PathVariable Long id){
        return new ResponseEntity<>(crudAccount.findOne(id),HttpStatus.OK);
    }
    @PostMapping
    private ResponseEntity<Void> create(@RequestBody Account account){
        if (account.getUsername()!=null&&account.getPassword()!=null){
            crudAccount.save(account);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
     return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @PutMapping("/{id}")
    private ResponseEntity<Void> update(@PathVariable Long id,@RequestBody Account account){
        Account account1=crudAccount.findOne(id);
        if (account1.getUsername()!=null&&account1.getPassword()!=null){
            crudAccount.save(account);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete(@PathVariable Long id){
        crudAccount.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{username}/{password}")
    private ResponseEntity<Account> login(@PathVariable String username,@PathVariable String password){
        Account account=crudAccount.login(username,password);
        if (account.getUsername().equals(username)&&account.getPassword().equals(password)){
            return new ResponseEntity<>(account,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
