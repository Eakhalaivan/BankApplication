package com.example.BankApplication.mappet;

import com.example.BankApplication.dto.AccountDTO;
import com.example.BankApplication.entity.Account;

/**
 * null.java
 * <p>
 * eakhalaivan — 18/12/25
 */
public class AccountMap {
    public static Account mapToAccount(AccountDTO accountDTO){
        Account account= new Account(
                accountDTO.getId(),
                accountDTO.getName(),
                accountDTO.getBalance()
        );
        return  account;
    }
    public static AccountDTO mapToAccountDto(Account account){
        AccountDTO accountDTO=new AccountDTO(
                account.getId(),
                account.getName(),
                account.getBalance()
        );

        return  accountDTO ;
    }
}
