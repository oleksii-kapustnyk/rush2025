package com.ua.rush.module3.lesson16.bridge;

public class Circle extends Shape {

    private final int radius;

    public Circle(Render render, int radius) {
        super(render);
        this.radius = radius;
    }

    @Override
    public void draw() {
        render.renderCircle(radius);
    }
}
