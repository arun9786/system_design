package org.example.testing.with;

import org.springframework.stereotype.Component;

@Component
public class BankTransferStrategyTesting implements PaymentStrategyTesting {

    @Override
    public String pay(double amount) {
        System.out.println("Payment with amount " + amount+" Bank Transfer Strategy");
        return "Payment with amount " + amount+" Bank Transfer Strategy";
    }

    @Override
    public String getType() {
        return "BANK_TRANSFER";
    }
}
