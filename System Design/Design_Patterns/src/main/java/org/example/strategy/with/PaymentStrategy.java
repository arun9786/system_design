package org.example.strategy.with;

public interface PaymentStrategy {
    void pay(double amount);

    String getType();
}