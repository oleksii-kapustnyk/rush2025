package com.ua.rush.module3.lesson16.facade;

public class Main {

    public static void main(String[] args) {
        SmsSender smsSender = new SmsSender();
        PushSender pushSender = new PushSender();
        EmailSender emailSender = new EmailSender();
        NotificationFacade notificationFacade = new NotificationFacade(smsSender, pushSender, emailSender);

        notificationFacade.notifyUser("123456789", "user@example.com", "123", "Subject", "Text");
    }
}
