package org.example.prototype;

public class Main {
    public static void main(String[] args) {
        Report masterTransactionReport =
                new Report(
                        "TRANSACTION_REPORT",
                        "IDFC FIRST BANK",
                        "Confidential"
                );

        Report report1 = masterTransactionReport.clone();
        report1.setCustomerName("John Doe");

        Report report2 = masterTransactionReport.clone();
        report2.setCustomerName("Arun R");

        Report report3 = masterTransactionReport.clone();
        report3.setCustomerName("Nandhini");


    }
}
