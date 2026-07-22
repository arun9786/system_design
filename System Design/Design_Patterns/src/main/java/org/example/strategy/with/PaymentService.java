package org.example.strategy.with;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentStrategyFactory factory;

    public PaymentService(
            PaymentStrategyFactory factory) {

        this.factory = factory;
    }

    public void processPayment(
            String type,
            double amount) {

        PaymentStrategy strategy =
                factory.getStrategy(type);

        strategy.pay(amount);
    }
}
