package org.example.prototype.without;

public class Main {

    public static void main(String[] args) {

        //For all months
//        new FinancialReport()
//
//        Loading company configuration...
//        Loading logo from storage...
//        Loading report template...
//        Loading header and footer...

        FinancialReport janReport =
                new FinancialReport();

        janReport.setMonth("January");
        janReport.setReportData(
                "January financial data"
        );


        FinancialReport febReport =
                new FinancialReport();

        febReport.setMonth("February");
        febReport.setReportData(
                "February financial data"
        );


        FinancialReport marchReport =
                new FinancialReport();

        marchReport.setMonth("March");
        marchReport.setReportData(
                "March financial data"
        );
    }
}
