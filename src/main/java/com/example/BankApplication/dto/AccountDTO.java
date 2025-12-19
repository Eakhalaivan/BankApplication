package com.example.BankApplication.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * null.java
 * <p>
 * eakhalaivan — 18/12/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private  Long id;

    private  String name;
    private  double balance;
}
