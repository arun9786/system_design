package org.example.testing.with;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentStrategyTesting implements PaymentStrategyTesting {
    @Override
    public String getType() {
        return "CREDIT_CARD";
    }

    @Override
    public String pay(double amount) {
        System.out.println("Payment using CreditCardPaymentStrategy");
        return "Paying CreditCardPaymentStrategy";
    }
}
