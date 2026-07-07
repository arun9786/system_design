package org.example.prototype.with;

public class FinancialReport
        implements ReportPrototype {

    private String companyName;
    private String logo;
    private String header;
    private String footer;
    private String reportType;

    private String month;
    private String reportData;

    public FinancialReport() {

        System.out.println(
                "Loading company configuration..."
        );

        System.out.println(
                "Loading logo from storage..."
        );

        System.out.println(
                "Loading report template..."
        );

        System.out.println(
                "Loading header and footer..."
        );

        this.companyName = "ABC Bank";
        this.logo = "abc-bank-logo.png";
        this.header = "Monthly Financial Report";
        this.footer = "Confidential";
        this.reportType = "FINANCIAL";
    }

    private FinancialReport(
            FinancialReport original) {

        this.companyName = original.companyName;
        this.logo = original.logo;
        this.header = original.header;
        this.footer = original.footer;
        this.reportType = original.reportType;

        this.month = original.month;
        this.reportData = original.reportData;
    }

    @Override
    public FinancialReport cloneReport() {

        return new FinancialReport(this);
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setReportData(String reportData) {
        this.reportData = reportData;
    }
}
