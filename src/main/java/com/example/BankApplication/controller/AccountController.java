package com.example.BankApplication.controller;

import com.example.BankApplication.dto.AccountDTO;
import com.example.BankApplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * null.java
 * <p>
 * eakhalaivan — 18/12/25
 */
@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @Autowired
    private AccountService accountService;
@PostMapping
    public ResponseEntity<AccountDTO> addAccount(@RequestBody AccountDTO accountDTO){
    return new ResponseEntity<>(accountService.createAccount(accountDTO), HttpStatus.CREATED);

}
@GetMapping("/{id}")
public ResponseEntity<AccountDTO> getAccountBYId(@PathVariable Long id){
    AccountDTO accountDTO= accountService.getAccountById(id);
    return  ResponseEntity.ok(accountDTO);
}
@PutMapping("/{id}/deposite")
    public ResponseEntity<AccountDTO> depsoite(@PathVariable Long id, @RequestBody Map<String,Double> request){
    Double amount= request.get("amount");
    AccountDTO accountDTO=accountService.deposite(id, amount);
    return  ResponseEntity.ok(accountDTO);
    }@PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDTO> withdraw(@PathVariable Long id, @RequestBody Map<String,Double> request){
        Double amount= request.get("amount");
        AccountDTO accountDTO=accountService.withdraw(id, amount);
        return  ResponseEntity.ok(accountDTO);
    }
    @GetMapping
    public ResponseEntity<List<AccountDTO>> getAllAccounts(){
    List<AccountDTO> accountDTOS= accountService.getAllAccount();
    return  ResponseEntity.ok(accountDTOS);

    }@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id){
         accountService.deleteAccount(id);
        return  ResponseEntity.ok("Account is Deleted sucessfully");
    }

}
