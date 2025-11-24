package com.ua.rush.module2.lesson14;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(10, Main::getThread);
//
//        for (int i = 0; i < 20; i++) {
//            int finalI = i;
//            executorService.submit(() -> {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(Thread.currentThread().getName() + " " + finalI);
//            });
//        }
//
//        Thread.sleep(513);

        //   executorService.shutdown();


        //   ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

//        executorService.schedule(() -> {
//            System.out.println("Hello");
//        }, 10, TimeUnit.SECONDS);

//        executorService.scheduleAtFixedRate(() -> {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }, 5, 1, TimeUnit.SECONDS);
//
//        executorService.scheduleWithFixedDelay(() -> {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }, 5, 1, TimeUnit.SECONDS);

        //  executorService.shutdown();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ThreadLocal<Integer> tl = new ThreadLocal<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                int value = rand.nextInt(100);
                System.out.println("I've generated " + value);
                tl.set(value);

            });
        }

        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println("I've got " + tl.get());
            });
        }

        executorService.shutdown();

    }

    private static Thread getThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName("my custom thread");
        t.setPriority(Thread.MIN_PRIORITY);
        t.setDaemon(true);

        return t;
    }
}
