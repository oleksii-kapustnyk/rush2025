package com.ua.rush.module3.lesson16.facade;

public class SmsSender {

    public void send(String phone, String text) {
        System.out.println("Send sms to " + phone + " with text " + text);
    }

}
