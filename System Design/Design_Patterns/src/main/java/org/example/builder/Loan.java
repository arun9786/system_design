package org.example.builder;

class Loan {

    private String customerName;
    private String loanType;
    private double amount;
    private int tenure;
    private double interestRate;
    private boolean insurance;
    private boolean foreclosureAllowed;

    Loan(LoanBuilder loanBuilder) {
        this.customerName = loanBuilder.customerName;
        this.loanType = loanBuilder.loanType;
        this.amount = loanBuilder.amount;
        this.tenure = loanBuilder.tenure;
        this.interestRate = loanBuilder.interestRate;
        this.insurance = loanBuilder.insurance;
        this.foreclosureAllowed = loanBuilder.foreclosureAllowed;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "customerName='" + customerName + '\'' +
                ", loanType='" + loanType + '\'' +
                ", amount=" + amount +
                ", tenure=" + tenure +
                ", interestRate=" + interestRate +
                ", insurance=" + insurance +
                ", foreclosureAllowed=" + foreclosureAllowed +
                '}';
    }

    static LoanBuilder loan() {
        return new LoanBuilder();
    }

    static class LoanBuilder {
        private String customerName;
        private String loanType;
        private double amount;
        private int tenure;
        private double interestRate;
        private boolean insurance;
        private boolean foreclosureAllowed;


        public LoanBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public LoanBuilder loanType(String loanType) {
            this.loanType = loanType;
            return this;
        }

        public Loan build() {
            return  new Loan(this);
        }
    }
}
