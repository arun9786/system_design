package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransferServiceTest {

    private final BankTransferService bankTransferService = new BankTransferService();

    @Test
    public void transferShouldBeValidForValidAmountAndBalance(){
        double amount = 5000;
        double balance = 10000;

        String actual = bankTransferService.transfer(amount, balance);

        assertEquals("SUCCESS", actual);

    }

    @Test
    public void throwExceptionForInvalidAmount(){
        double amount = -10;
        double balance = 1000;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {bankTransferService.transfer(amount, balance);
        });

        assertEquals("Transfer amount must be positive", exception.getMessage());
    }

    @Test
    public void throwExceptionAndValidResponseIfAmountIsGreaterThanBalance(){
        double amount = 15000;
        double balance = 10000;

        IllegalStateException exception = assertThrows(IllegalStateException.class, ()->bankTransferService.transfer(amount, balance));

        assertEquals("Insufficient balance", exception.getMessage());

    }
}
