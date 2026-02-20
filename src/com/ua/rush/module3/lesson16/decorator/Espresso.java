package com.ua.rush.module3.lesson16.decorator;

public class Espresso implements Coffe {
    @Override
    public String getDesctiption() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }

}
