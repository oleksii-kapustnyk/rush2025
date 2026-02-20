package com.ua.rush.module3.lesson16.facade;

public class EmailSender {

    public void send(String email, String subject, String text) {
        System.out.println("Send email to " + email + " with subject " + subject + " and text " + text);
    }

}
