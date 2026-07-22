package org.example.testing.with;

import org.springframework.stereotype.Component;

@Component
public class UPIPaymentStrategyTesting implements PaymentStrategyTesting {

    @Override
    public String pay(double amount) {
        System.out.println("Paying " + amount + " from UPI");
        return "Paying " + amount + " from UPI";
    }

    @Override
    public String getType() {
        return "UPI";
    }
}
