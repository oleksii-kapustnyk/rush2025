package com.ua.rush.module2.lesson11;

public class ClassAMulty implements Runnable {

    private int count;

    public ClassAMulty(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("I'm runnable thread " + count);
    }

}
