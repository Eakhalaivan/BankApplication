package com.example.BankApplication.service;

import com.example.BankApplication.dto.AccountDTO;
import com.example.BankApplication.entity.Account;
import com.example.BankApplication.mappet.AccountMap;
import com.example.BankApplication.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * null.java
 * <p>
 * eakhalaivan — 18/12/25
 */
@Service
public class AccountServiceImp implements  AccountService{
    public AccountServiceImp(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Autowired
    AccountRepository accountRepository;
    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        Account account= AccountMap.mapToAccount(accountDTO);
        Account saveAccount= accountRepository.save(account);
        return AccountMap.mapToAccountDto(saveAccount);

    }

    @Override
    public AccountDTO getAccountById(Long id) {
       Account account= accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
        return AccountMap.mapToAccountDto(account);
    }

    @Override
    public AccountDTO deposite(Long id, double amount) {
        Account account= accountRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Account does not exists"));
        double total = account.getBalance()+amount;
        account.setBalance(total);
        Account saveAccount= accountRepository.save(account);
        return AccountMap.mapToAccountDto(saveAccount);
    }

    @Override
    public AccountDTO withdraw(Long id, double amount) {
        Account account= accountRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Account does not exists"));
if(account.getBalance()<amount){
    throw  new RuntimeException("Insufficient Balance");
}
double total = account.getBalance()-amount;
        account.setBalance(total);
        Account saveAccount= accountRepository.save(account);
        return AccountMap.mapToAccountDto(saveAccount);
    }

    @Override
    public List<AccountDTO> getAllAccount() {
        List<Account> accounts= accountRepository.findAll();
        return accounts.stream().map((account)->AccountMap.mapToAccountDto(account))
                .collect(Collectors.toList() );
    }

    @Override
    public void deleteAccount(Long id) {
        Account account= accountRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Id not found"));
        accountRepository.deleteById(id);
    }


}
