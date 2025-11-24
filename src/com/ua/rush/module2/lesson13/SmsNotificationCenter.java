package com.ua.rush.module2.lesson13;

public class SmsNotificationCenter extends NotificationCenter {

    @Override
    Notification createNotification() {
        return new SmsNotification();
    }

}
