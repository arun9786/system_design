package org.example.interfacesegregation.badcode;

public class LoanClosureService {
    private LoanPayment loanPayment;
    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void doLoanPayment(int amount) {
        loanPayment.doPayment(amount);
    }

    public void doForeClosure() {
        loanPayment.foreCloseLoan();
    }
}
