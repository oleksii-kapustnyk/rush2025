package com.ua.rush.module3.lesson16.bridge;

public class Square extends Shape {

    private final int side;

    public Square(Render render, int side) {
        super(render);
        this.side = side;
    }

    @Override
    public void draw() {
        render.renderSquare(side);
    }
}
