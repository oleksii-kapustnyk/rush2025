package com.ua.rush.module3.lesson16.bridge;

public abstract class Shape {

    protected Render render;

    public Shape(Render render) {
        this.render = render;
    }

    public void setRender(Render render) {
        this.render = render;
    }

    public abstract void draw();

}
