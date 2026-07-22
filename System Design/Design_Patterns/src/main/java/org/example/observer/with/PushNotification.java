package org.example.observer.with;

public class PushNotification
        implements LoanObserver {

    @Override
    public void update(
            String customerName,
            String loanStatus) {

        System.out.println(
                "Push notification sent to "
                        + customerName
                        + ": Loan status is "
                        + loanStatus
        );
    }
}
