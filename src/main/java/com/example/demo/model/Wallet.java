package com.example.demo.model;

import com.example.demo.model.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCard;
    private Double moneyAmount;
    @ManyToOne
    private WalletCategory walletCategory;
    @OneToOne
    private Account account;
}
