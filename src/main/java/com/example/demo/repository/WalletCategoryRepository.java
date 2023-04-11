package com.example.demo.repository;

import com.example.demo.model.WalletCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface WalletCategoryRepository extends JpaRepository<WalletCategory,Long> {
}
