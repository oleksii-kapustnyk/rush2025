package com.ua.rush.module2.lesson13;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    private int a;
    private int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("working");
        Thread.sleep(1000);
        return a + b;
    }

}
