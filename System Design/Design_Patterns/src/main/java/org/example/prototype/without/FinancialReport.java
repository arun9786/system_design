package org.example.prototype.without;

public class FinancialReport {

    private String companyName;
    private String logo;
    private String header;
    private String footer;
    private String reportType;

    private String month;
    private String reportData;

    public FinancialReport() {

        // Imagine expensive operations
        System.out.println("Loading company configuration...");
        System.out.println("Loading logo from storage...");
        System.out.println("Loading report template...");
        System.out.println("Loading header and footer...");

        this.companyName = "ABC Bank";
        this.logo = "abc-bank-logo.png";
        this.header = "Monthly Financial Report";
        this.footer = "Confidential";
        this.reportType = "FINANCIAL";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getReportData() {
        return reportData;
    }

    public void setReportData(String reportData) {
        this.reportData = reportData;
    }

    // setters
}
