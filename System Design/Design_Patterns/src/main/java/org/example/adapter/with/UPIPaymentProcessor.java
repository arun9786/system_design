package org.example.adapter.with;

import org.example.adapter.without.PaymentProcessor;

public class UPIPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI Payment Processor");
    }
}
