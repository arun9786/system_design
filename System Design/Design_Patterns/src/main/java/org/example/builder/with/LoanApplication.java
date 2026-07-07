package org.example.builder.with;

public class LoanApplication {

    private final String customerName;
    private final double loanAmount;
    private final int tenure;

    private final double interestRate;
    private final String loanType;
    private final String employmentType;
    private final double monthlyIncome;
    private final String collateralDetails;

    private LoanApplication(Builder builder) {
        this.customerName = builder.customerName;
        this.loanAmount = builder.loanAmount;
        this.tenure = builder.tenure;
        this.interestRate = builder.interestRate;
        this.loanType = builder.loanType;
        this.employmentType = builder.employmentType;
        this.monthlyIncome = builder.monthlyIncome;
        this.collateralDetails = builder.collateralDetails;
    }

    public static class Builder {

        private String customerName;
        private double loanAmount;
        private int tenure;

        private double interestRate;
        private String loanType;
        private String employmentType;
        private double monthlyIncome;
        private String collateralDetails;

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder loanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
            return this;
        }

        public Builder tenure(int tenure) {
            this.tenure = tenure;
            return this;
        }

        public Builder interestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder loanType(String loanType) {
            this.loanType = loanType;
            return this;
        }

        public Builder employmentType(String employmentType) {
            this.employmentType = employmentType;
            return this;
        }

        public Builder monthlyIncome(double monthlyIncome) {
            this.monthlyIncome = monthlyIncome;
            return this;
        }

        public Builder collateralDetails(String collateralDetails) {
            this.collateralDetails = collateralDetails;
            return this;
        }

        public LoanApplication build() {
            return new LoanApplication(this);
        }
    }
}
