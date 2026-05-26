package org.example.interfacesegregation.correctcode;

public class LoanClosureService {
    private LoanPayment loanPayment;
    private SecureLoan secureLoan;
    public LoanClosureService(LoanPayment loanPayment, SecureLoan secureLoan) {
        this.loanPayment = loanPayment;
        this.secureLoan = secureLoan;
    }

    public void doLoanPayment(int amount) {
        loanPayment.doPayment(amount);
    }

    public void doForeClosure() {
        secureLoan.foreCloseLoan();
    }
}
