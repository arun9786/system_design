package org.example.observer.with;

public class SmsNotification
        implements LoanObserver {

    @Override
    public void update(
            String customerName,
            String loanStatus) {

        System.out.println(
                "SMS sent to "
                        + customerName
                        + ": Loan status is "
                        + loanStatus
        );
    }
}
