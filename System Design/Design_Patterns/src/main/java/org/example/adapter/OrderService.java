package org.example.adapter;

public class OrderService {

    PaymentProcessor paymentProcessor;

    OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    void processPayment(double amount) {
        paymentProcessor.pay(amount);
    }
}
