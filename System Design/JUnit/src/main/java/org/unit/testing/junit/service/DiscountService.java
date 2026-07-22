package org.unit.testing.junit.service;

public class DiscountService {

    public double calculateDiscount(double amount) {

        if (amount >= 1000) {
            return amount * 0.10;
        }

        return 0;
    }
}
