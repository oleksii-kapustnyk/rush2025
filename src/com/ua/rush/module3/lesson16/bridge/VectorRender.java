package com.ua.rush.module3.lesson16.bridge;

public class VectorRender implements Render {

    @Override
    public void renderCircle(int radius) {
        System.out.println("Vector render circle");
    }

    @Override
    public void renderSquare(int side) {
        System.out.println("Vector render square");
    }

}
