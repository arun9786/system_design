package org.example.adapter.without;

//Client Code
public class PaymentService {

    private final StripePaymentGateway stripeGateway;

    public PaymentService(
            StripePaymentGateway stripeGateway) {

        this.stripeGateway = stripeGateway;
    }

    public void makePayment(double amount) {

        long amountInPaise =
                (long) (amount * 100);

        //Not calling the PaymentProcessor's processPayment method
        stripeGateway.makeStripePayment(
                amountInPaise,
                "INR"
        );

        //Or

//        if (provider.equals("STRIPE")) {
//
//            long paise = (long) (amount * 100);
//
//            stripe.makeStripePayment(
//                    paise,
//                    "INR"
//            );
//
//        } else if (provider.equals("PAYPAL")) {
//
//            paypal.sendMoney(
//                    amount,
//                    "user@example.com"
//            );
//
//        } else if (provider.equals("RAZORPAY")) {
//
//            razorpay.createOrder(
//                    amount,
//                    "INR"
//            );
//        }
    }
}
