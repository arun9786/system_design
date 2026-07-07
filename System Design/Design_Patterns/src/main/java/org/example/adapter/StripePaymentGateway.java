package org.example.adapter;

public class StripePaymentGateway { // consider external SDK
    void makePayment(double amount, String county) {
        System.out.println("Making Payment of amount " + amount + " for county " + county);
    }
}
