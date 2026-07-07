package org.example.prototype;

public class Report{

    private String reportType;
    private String header;
    private String footer;
    private String customerName;

    public Report(
            String reportType,
            String header,
            String footer) {

        System.out.println(
                "Expensive report configuration loading..."
        );

        this.reportType = reportType;
        this.header = header;
        this.footer = footer;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public Report clone() {

        try {
            return (Report) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}