package org.example.observer.with;

public class EmailNotification
        implements LoanObserver {

    @Override
    public void update(
            String customerName,
            String loanStatus) {

        System.out.println(
                "Email sent to "
                        + customerName
                        + ": Loan status is "
                        + loanStatus
        );
    }
}
