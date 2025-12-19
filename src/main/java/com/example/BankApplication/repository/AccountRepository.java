package com.example.BankApplication.repository;

import com.example.BankApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * null.java
 * <p>
 * eakhalaivan — 18/12/25
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}
