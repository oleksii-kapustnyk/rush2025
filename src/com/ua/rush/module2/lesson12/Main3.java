package com.ua.rush.module2.lesson12;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main3 {

    public static void main(String[] args) {
        List<String> l1 = Collections.synchronizedList(new ArrayList<>());
        AtomicInteger a1 = new AtomicInteger(1);
        a1.decrementAndGet();
        a1.getAndIncrement();
        a1.getAndDecrement();
        a1.getAndSet(10);
        a1.getAndUpdate(operand -> {
            return 1;
        });

        a1.getAndAccumulate(1, (x, y) -> {
            return x + y;
        });
    }
}
