package org.example.strategy.with;

import org.springframework.stereotype.Component;

@Component
public class UpiPaymentStrategy
        implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid ₹" + amount + " using UPI"
        );
    }

    @Override
    public String getType() {
        return "UPI";
    }
}
