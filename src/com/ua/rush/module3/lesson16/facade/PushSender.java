package com.ua.rush.module3.lesson16.facade;

public class PushSender {

    public void send(String userId, String text) {
        System.out.println("Send push to " + userId + " with text " + text);
    }

}
