package com.ua.rush.module2.lesson13;

public abstract class NotificationCenter {

    abstract Notification createNotification();

    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }

}
