package com.ua.rush.module2.lesson4;

public interface Eatable {

    void eat();


    default void eatBanana() {
        System.out.println("Eating banana");
    }

    default void eatApple() {
        System.out.println("Eating apple");
    }
}
