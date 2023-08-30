package org.example;

public class NotificationSystem {
    public void notifyUser(NotificationChannel channel, String mesage) {
        channel.send(mesage);
    }
}
