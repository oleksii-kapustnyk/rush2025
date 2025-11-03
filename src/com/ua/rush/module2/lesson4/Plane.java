package com.ua.rush.module2.lesson4;

public class Plane implements Flyable, Refuelable {

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void refuel() {
        System.out.println("Plane is refueling");
    }
}
