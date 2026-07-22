package org.example.strategy.with;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentStrategy
        implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid ₹" + amount + " using Credit Card"
        );
    }

    @Override
    public String getType() {
        return "CREDIT_CARD";
    }
}
