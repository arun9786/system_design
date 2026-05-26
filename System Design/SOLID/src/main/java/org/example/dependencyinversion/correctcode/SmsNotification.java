package org.example.dependencyinversion.correctcode;

class SmsNotification
        implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println(
                "SMS Sent: " + message
        );
    }
}
