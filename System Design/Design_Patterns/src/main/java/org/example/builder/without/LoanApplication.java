package org.example.builder.without;

public class LoanApplication {

    private String customerName;
    private double loanAmount;
    private int tenure;
    private double interestRate;
    private String loanType;
    private String employmentType;
    private double monthlyIncome;
    private String collateralDetails;

    public LoanApplication() {
    }

    public LoanApplication(
            String customerName,
            double loanAmount,
            int tenure,
            double interestRate,
            String loanType,
            String employmentType,
            double monthlyIncome,
            String collateralDetails) {

        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.interestRate = interestRate;
        this.loanType = loanType;
        this.employmentType = employmentType;
        this.monthlyIncome = monthlyIncome;
        this.collateralDetails = collateralDetails;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getCollateralDetails() {
        return collateralDetails;
    }

    public void setCollateralDetails(String collateralDetails) {
        this.collateralDetails = collateralDetails;
    }
}