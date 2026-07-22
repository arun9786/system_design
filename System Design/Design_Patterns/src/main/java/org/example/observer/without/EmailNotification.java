package org.example.observer.without;

public class EmailNotification {

    public void sendEmail(String customerName,String loanStatus) {

        System.out.println(
                "Email sent to "
                        + customerName
                        + ": Loan status is "
                        + loanStatus
        );
    }
}