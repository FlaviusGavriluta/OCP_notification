package org.example;

public class SMSNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
