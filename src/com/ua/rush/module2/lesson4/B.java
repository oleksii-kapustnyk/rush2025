package com.ua.rush.module2.lesson4;

public interface B {

    int DATA = 2;

    default void test() {
        System.out.println("Test B");
    }
}
