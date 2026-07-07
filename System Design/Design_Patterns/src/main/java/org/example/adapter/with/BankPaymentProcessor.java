package org.example.adapter.with;

import org.example.adapter.without.PaymentProcessor;

public class BankPaymentProcessor
        implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {

        System.out.println(
                "Processing bank payment: ₹" + amount
        );
    }
}
