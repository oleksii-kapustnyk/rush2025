package com.ua.rush.module3.lesson16.bridge;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(new VectorRender(), 5);
        circle.draw();
        circle.setRender(new RastorRender());
        circle.draw();

        Shape square = new Square(new RastorRender(), 5);
        square.draw();
    }
}
