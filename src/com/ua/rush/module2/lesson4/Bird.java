package com.ua.rush.module2.lesson4;

public class Bird implements Flyable, Eatable {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void sing() {
        System.out.println("Bird is singing");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }
}
