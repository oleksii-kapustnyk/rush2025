package com.ua.rush.module3.lesson16.bridge;

public class RastorRender implements Render {

    @Override
    public void renderCircle(int radius) {
        System.out.println("Rastor render circle");
    }

    @Override
    public void renderSquare(int side) {
        System.out.println("Rastor render square");
    }

}
