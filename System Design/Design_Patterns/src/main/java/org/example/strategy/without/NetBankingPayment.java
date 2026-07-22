package org.example.strategy.without;

public class NetBankingPayment {
    public void pay(double amount) {
        System.out.println(
                "Paid ₹" + amount + " using Credit Card"
        );
    }
}
