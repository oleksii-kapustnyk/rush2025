package com.ua.rush.module3.lesson19;

import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        AtomicInteger ai1 = new AtomicInteger(3);
//        AtomicBoolean ab1 = new AtomicBoolean();
////        ab1.
//        final int[] a = {3};
//
//
//        for (final int[] i = {0}; i[0] <5; i[0]++) {
//            new Thread(() -> {
//                for (int j = 0; j < 30; j++) {
//                    System.out.println("atomic " + ai1.incrementAndGet());
//                    System.out.println("common " + a[0]++);
//                    System.out.println("-----------");
//                    try {
//                        Thread.sleep(new Random(1000).nextInt(1000));
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }).start();
//        }
//
//
//        Map<Integer, Integer> concurrentMap = new HashMap<>();
//        var syncedList = Collections.synchronizedList(new ArrayList<>());

        LinkedBlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

        new Thread(() -> {
            System.out.println("Waiting for data:");
            Integer data = null;
            try {
                while (true) {
                    data = blockingDeque.take();
                    System.out.println(data);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        Thread.sleep(1000);

        for (int i = 0; i < 20; i++) {
            blockingDeque.add(i);
            Thread.sleep(1000);

        }


//        blockingDeque.


    }


}
