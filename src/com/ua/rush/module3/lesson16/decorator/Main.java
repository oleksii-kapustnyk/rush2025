package com.ua.rush.module3.lesson16.decorator;

public class Main {

    public static void main(String[] args) {
        Coffe coffe = new Espresso();
        coffe = new SyropDecorator(coffe);
        coffe = new MilkDecorator(coffe);

        System.out.println(coffe.getCost() + ": " + coffe.getDesctiption());


    }
}
