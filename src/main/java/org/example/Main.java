package org.example;

public class Main {
    public static void main(String[] args) {
        NotificationSystem system = new NotificationSystem();
        NotificationChannel email = new EmailNotification();
        NotificationChannel sms = new SMSNotification();

        system.notifyUser(email, "This is an email notification");
        system.notifyUser(sms, "This is a SMS notification");
    }
}