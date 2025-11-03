package com.ua.rush.module2.lesson4;

public interface A {

    int DATA = 1;

    default void test() {
        System.out.println("Test A");
    }
}
