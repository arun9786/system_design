package org.unit.testing.junit.dto;

public class Order {

    private Long id;
    private String productName;
    private double amount;
    private String status;

    public Order(
            Long id,
            String productName,
            double amount,
            String status) {
        this.id = id;
        this.productName = productName;
        this.amount = amount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}
