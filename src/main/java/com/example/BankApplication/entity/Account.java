package com.example.BankApplication.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * null.java
 * <p>
 * eakhalaivan — 18/12/25
 */
@Entity
@Table (name="accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;
     @Column (name="account_holder_name")
    private  String name;
    private  double balance;
}
