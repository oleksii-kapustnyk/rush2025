package com.ua.rush.module2.lesson13;

import java.util.concurrent.CompletableFuture;

public class Main3 {

    public static void main(String[] args) {
        NotificationCenter center = new EmailNotificationCenter();
        center.notifyUser("Hello");

        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> 1 + 2)
                .thenApply(integer -> integer * 2);
    }
}
