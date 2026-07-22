package org.example.observer.without;

public class PushNotification {

    public void sendPushNotification(
            String customerName,String loanStatus) {

        System.out.println(
                "Push Notification sent to "
                        + customerName
                        + ": Loan status is "
                        + loanStatus
        );
    }
}
