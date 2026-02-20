package com.ua.rush.module3.lesson16.decorator;

public class SyropDecorator extends CoffeDecorator {

    public SyropDecorator(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDesctiption() {
        return coffe.getDesctiption() + " syrop,";
    }

    @Override
    public double getCost() {
        return coffe.getCost() + 0.5;
    }

}
