package org.example.observer.without;

public class SmsNotification {

    public void sendSms(String customerName,String loanStatus) {

        System.out.println(
                "SMS sent to "
                        + customerName
                        + ": Loan status is "
                        + loanStatus
        );
    }
}
