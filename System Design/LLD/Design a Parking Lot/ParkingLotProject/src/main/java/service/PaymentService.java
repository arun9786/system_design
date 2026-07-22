package service;

import enums.PaymentType;
import model.ParkingTicket;
import model.Payment;
import strategy.PricingStrategy;

public class PaymentService {

    private PricingStrategy pricingStrategy;

    public PaymentService(
            PricingStrategy pricingStrategy) {

        this.pricingStrategy = pricingStrategy;
    }

    public Payment pay(
            ParkingTicket ticket,
            PaymentType paymentType) {

        double amount =
                pricingStrategy.calculate(ticket);

        Payment payment =
                new Payment();

        // Process payment

        return payment;

    }

}
