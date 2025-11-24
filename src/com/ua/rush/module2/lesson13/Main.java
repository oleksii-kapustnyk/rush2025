package com.ua.rush.module2.lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
//        ThreadGroup tg1 = new ThreadGroup("Group1");
//
//        Thread t1 = new Thread(tg1, () -> {
//            sleep();
//            System.out.println("Thread 1");
//        });
//        Thread t2 = new Thread(tg1, () -> {
//            sleep();
//            System.out.println("Thread 2");
//        });
//        t1.start();
//        t2.start();
//
//        System.out.println(tg1.activeCount());
//        System.out.println(tg1.getName());
//        System.out.println(tg1.suspend());
//        System.out.println(tg1.resume());

        for (int j = 0; j < 5000; j++) {
            ExecutorService executorService = Executors.newFixedThreadPool(500);

            for (int i = 0; i < 30; i++) {
                int finalI = i;
                executorService.submit(() -> {
                    sleep();
                    System.out.println("Thread " + finalI);
                });
            }
            System.out.println("after loop");
            executorService.shutdown();
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }



       // executorService.shutdown();

    }

    private static void sleep() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
