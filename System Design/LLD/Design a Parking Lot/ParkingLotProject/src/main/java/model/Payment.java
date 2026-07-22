package model;

import enums.PaymentStatus;
import enums.PaymentType;

public class Payment {

    private String paymentId;

    private double amount;

    private PaymentType paymentType;

    private PaymentStatus paymentStatus;

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

}
