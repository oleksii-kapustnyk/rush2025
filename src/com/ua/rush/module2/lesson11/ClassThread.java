package com.ua.rush.module2.lesson11;

public class ClassThread extends Thread {

    @Override
    public void run() {
        System.out.println("In thread run");
        Thread.currentThread().interrupt();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        Thread.currentThread().stop();



        Thread.currentThread().setName("Test thread");
        System.out.println(Thread.currentThread().getName());


        System.out.println("End this thread");
    }
}
