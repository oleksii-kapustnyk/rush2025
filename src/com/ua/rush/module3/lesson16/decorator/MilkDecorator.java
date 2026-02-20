package com.ua.rush.module3.lesson16.decorator;

public class MilkDecorator extends CoffeDecorator {

    public MilkDecorator(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDesctiption() {
        return coffe.getDesctiption() + " milk,";
    }

    @Override
    public double getCost() {
        return coffe.getCost() + 0.33;
    }

}
