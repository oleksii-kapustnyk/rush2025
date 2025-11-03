package com.ua.rush.module2.lesson5;

public class NumberBox<T extends Number> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
