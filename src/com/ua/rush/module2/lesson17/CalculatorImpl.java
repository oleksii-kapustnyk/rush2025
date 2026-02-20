package com.ua.rush.module2.lesson17;

import java.util.Random;

public class CalculatorImpl implements Calculator {

    @Override
    public int calculate(int x) {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(2000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return x * x;
    }
}
