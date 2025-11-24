package com.ua.rush.module2.lesson13;

public class EmailNotificationCenter extends NotificationCenter {

    @Override
    Notification createNotification() {
        return new EmailNotification();
    }

}
