package com.ua.rush.module3.lesson16.facade;

public class NotificationFacade {

    private final SmsSender smsSender;
    private final PushSender pushSender;
    private final EmailSender emailSender;

    public NotificationFacade(SmsSender smsSender, PushSender pushSender, EmailSender emailSender) {
        this.smsSender = smsSender;
        this.pushSender = pushSender;
        this.emailSender = emailSender;
    }

    public void notifyUser(String phone, String email, String userId, String subject, String text) {
        smsSender.send(phone, text);
        pushSender.send(userId, text);
        emailSender.send(email, subject, text);
    }

}
