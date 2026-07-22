package org.example.testing.with;

public class PaymentDTOTesting {

    public String type;
    public double amount;
    public PaymentDTOTesting() {}

    public PaymentDTOTesting(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
