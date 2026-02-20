package com.ua.rush.module1.lesson12;

public abstract class Figure {

    private String name;

    public void sayName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
