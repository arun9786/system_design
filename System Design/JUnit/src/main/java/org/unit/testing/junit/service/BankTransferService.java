package org.unit.testing.junit.service;


import org.springframework.stereotype.Service;

@Service
public class BankTransferService {

    public String transfer(
            double amount,
            double balance) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Transfer amount must be positive"
            );
        }

        if (amount > balance) {
            throw new IllegalStateException(
                    "Insufficient balance"
            );
        }

        return "SUCCESS";
    }
}
