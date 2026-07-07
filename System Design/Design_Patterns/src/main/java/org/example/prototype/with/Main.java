package org.example.prototype.with;

public class Main {

    public static void main(String[] args) {

        // Expensive creation only once
        FinancialReport prototype =
                new FinancialReport();

        // Clone for January
        FinancialReport janReport =
                prototype.cloneReport();

        janReport.setMonth("January");
        janReport.setReportData(
                "January financial data"
        );


        // Clone for February
        FinancialReport febReport =
                prototype.cloneReport();

        febReport.setMonth("February");
        febReport.setReportData(
                "February financial data"
        );


        // Clone for March
        FinancialReport marchReport =
                prototype.cloneReport();

        marchReport.setMonth("March");
        marchReport.setReportData(
                "March financial data"
        );
    }
}
