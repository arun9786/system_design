package org.example.strategy.without;

public class PaymentDTO {

    String paymentType;
    double amount;

    public PaymentDTO(String paymentType, double amount) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
