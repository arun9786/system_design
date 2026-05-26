package org.example.openorclosed.badcode;

class PaymentService {

    public void processPayment(String paymentType) {

        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card payment");

        } else if (paymentType.equals("UPI")) {
            System.out.println("Processing UPI payment");

        } else if (paymentType.equals("NET_BANKING")) {
            System.out.println("Processing net banking payment");
        }
    }
}
