package com.example.demo.repository;

import com.example.demo.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AccountRepository extends JpaRepository<Account,Long> {
    @Query(value = "select a from Account a where a.username=:username and a.password=:password")
    Account findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}


