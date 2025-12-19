package com.example.BankApplication.service;

import com.example.BankApplication.dto.AccountDTO;

import java.util.List;

/**
 * null.java
 * <p>
 * eakhalaivan — 18/12/25
 */
public interface AccountService {
    AccountDTO createAccount(AccountDTO accountDTO);
    AccountDTO getAccountById(Long id);
    AccountDTO deposite(Long id,double amount);
    AccountDTO withdraw(Long id,double amount);
    List<AccountDTO> getAllAccount();
    void  deleteAccount(Long id);
}
