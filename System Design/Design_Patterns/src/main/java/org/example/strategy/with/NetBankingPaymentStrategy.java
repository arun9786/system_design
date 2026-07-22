package org.example.strategy.with;

import org.springframework.stereotype.Component;

@Component
public class NetBankingPaymentStrategy
        implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid ₹" + amount + " using Net Banking"
        );
    }

    @Override
    public String getType() {
        return "NET_BANKING";
    }
}