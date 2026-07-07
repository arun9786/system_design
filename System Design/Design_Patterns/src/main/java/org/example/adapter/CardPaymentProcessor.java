package org.example.adapter;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Card Payment is processing...");
    }
}
