package org.example.adapter.without;

public class BankPaymentProcessor
        implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {

        System.out.println(
                "Processing bank payment: ₹" + amount
        );
    }
}
