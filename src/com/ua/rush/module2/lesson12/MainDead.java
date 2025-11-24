package com.ua.rush.module2.lesson12;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainDead {

    private static final Object monitorA = new Object();
    private static final Object monitorB = new Object();

    public static void main(String[] args) {
        Lock lockA = new ReentrantLock();
        Lock lockB = new ReentrantLock();


//        Thread t1 = new Thread(() -> {
//           synchronized (monitorA) {
//               System.out.println("Thread 1: using monitor a");
//               sleep(100);
//               synchronized (monitorB) {
//                   System.out.println("Thread 1: using monitor b");
//               }
//           }
//        });
//
//        Thread t2 = new Thread(() -> {
//            synchronized (monitorB) {
//                System.out.println("Thread 2: using monitor b");
//                sleep(100);
//                synchronized (monitorA) {
//                    System.out.println("Thread 2: using monitor a");
//                }
//            }
//        });

        Thread t1 = new Thread(() -> {
            while (true) {
                try {
                    if (lockA.tryLock(100, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println("Thread 1: using lock a");
                            sleep(100);
                            if (lockB.tryLock(100, TimeUnit.MILLISECONDS)) {
                                try {
                                    System.out.println("Thread 1: using lock b");
                                    break;
                                } finally {
                                    lockB.unlock();
                                }
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        } finally {
                            lockA.unlock();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                try {
                    if (lockB.tryLock(50, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println("Thread 2: using lock b");
                            sleep(100);
                            if (lockA.tryLock(50, TimeUnit.MILLISECONDS)) {
                                try {
                                    System.out.println("Thread 2: using lock a");
                                    break;
                                } finally {
                                    lockA.unlock();
                                }
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        } finally {
                            lockB.unlock();
                        }

                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();


    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
