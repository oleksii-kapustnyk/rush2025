package com.ua.rush.module2.lesson14;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main2 {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer::produce);
        Thread t2 = new Thread(consumer::consume);
        Thread t3 = new Thread(consumer::consume);

        t1.start();
        t2.start();
        t3.start();


    }


    static class Producer {
        private final BlockingQueue<Integer> queue;
        private Random rand = new Random();

        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public void produce() {
            while (true) {
                try {
                    Thread.sleep(500);
                    int value = rand.nextInt(100);
                    System.out.println("Produced: " + value);
                    queue.put(value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    static class Consumer {
        private final BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public void consume() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    Integer value = queue.take();
                    System.out.println("Consumed: " + value + ", queue size: " + queue.size() + " " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
