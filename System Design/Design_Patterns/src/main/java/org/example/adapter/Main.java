package org.example.adapter;


public class Main {
    public static void main(String[] args) {
        /// Api
        OrderService orderService = new OrderService(new StripePaymentAdapter(new StripePaymentGateway()));
        orderService.processPayment(1000);
    }
}
