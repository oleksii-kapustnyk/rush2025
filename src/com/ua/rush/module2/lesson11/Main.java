package com.ua.rush.module2.lesson11;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Begin");
//        ClassAMulty c1 = new ClassAMulty(1);
//        ClassAMulty c2 = new ClassAMulty(2);
//        ClassAMulty c3 = new ClassAMulty(3);
//        Thread t1 = new Thread(c1);
//        Thread t2 = new Thread(c2);
//        Thread t3 = new Thread(c3);
//        t1.start();
//        Thread.sleep(10);
//        t2.start();
//        Thread.sleep(10);
//        t3.start();

        ClassThread ct = new ClassThread();
        ct.start();


        // new Thread(() -> System.out.println("anonymus real")).start();

//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("End");
    }
}
