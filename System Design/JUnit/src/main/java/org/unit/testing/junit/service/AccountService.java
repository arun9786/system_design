package org.unit.testing.junit.service;

import org.unit.testing.junit.dto.Account;
import org.unit.testing.junit.repository.AccountRepository;

public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account getAccount(Long id) {

        Account account = repository.findById(id);

        if (account == null) {
            throw new RuntimeException("Account not found");
        }

        return account;
    }

    public void createAccount(String holderName, double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        Account account = new Account();

        account.setHolderName(holderName);
        account.setBalance(balance);

        repository.save(account);
    }

    public void deleteAccount(Long id) {

        if (id <= 0) {
            return;
        }

        repository.deleteById(id);
    }
}
