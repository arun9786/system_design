package org.example.adapter.with;

//Client Code
public class PaymentService {

    private final PaymentProcessor paymentProcessor;

    public PaymentService(
            PaymentProcessor paymentProcessor) {

        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {

        paymentProcessor.processPayment(amount);
    }
}
