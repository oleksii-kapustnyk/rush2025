package com.ua.rush.module2.lesson12;

public class Main {

    public static void main(String[] args) {
        Account a1 = new Account();
        Thread t1 = new Thread(() -> a1.deposit(100));
        Thread t2 = new Thread(() -> a1.deposit(200));
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                a1.deposit(1);
                if (i % 2 == 0) {
                    Thread.yield();
                }
            }
        });
//        Thread t3 = new Thread(() -> {
//            synchronized (a1) {
//                System.out.println("I'm in sync block");
//            }
//        });
        t1.start();
        t2.start();
     //   t3.start();

        try {
            t1.join();
//            System.out.println("after t1 joined");
            t2.join();
         //   t3.start();
//            System.out.println("after t2 joined");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Balance: " + a1.getBalance());
    }


}

class Account {
    private int balance = 0;
    private final Object monitor = new Object();

    public void deposit(int amount) {
        System.out.println("Started deposit");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (monitor) {
            balance += amount;
       }

        System.out.println("Finished deposit");
    }

    public int getBalance() {
        return balance;
    }

}
