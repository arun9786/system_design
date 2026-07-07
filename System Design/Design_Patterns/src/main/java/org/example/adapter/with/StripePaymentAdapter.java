package org.example.adapter.with;

public class StripePaymentAdapter
        implements PaymentProcessor {

    private final StripePaymentGateway stripeGateway;

    public StripePaymentAdapter(
            StripePaymentGateway stripeGateway) {

        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {

        // Convert application's format
        // into external gateway's format

        long amountInPaise =
                (long) (amount * 100);

        stripeGateway.makeStripePayment(
                amountInPaise,
                "INR"
        );
    }
}
