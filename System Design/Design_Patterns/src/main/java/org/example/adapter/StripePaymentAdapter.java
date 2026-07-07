package org.example.adapter;

import org.springframework.beans.factory.annotation.Autowired;

public class StripePaymentAdapter implements PaymentProcessor {


    StripePaymentGateway stripePaymentGateway;
    @Autowired
    public StripePaymentAdapter(StripePaymentGateway stripePaymentGateway) {
        this.stripePaymentGateway = stripePaymentGateway;
    }

    @Override
    public void pay(double amount) {
        stripePaymentGateway.makePayment(amount, "INR");
    }
}
