package com.ua.rush.lesson14;

public class Parent {

    private int a;
    private static final int MY_VARIABLE;

    static {
        MY_VARIABLE = 5;
        System.out.println("Parent static init block");
    }

    static {
        System.out.println("Parent static init block 2");
    }

    {
        init();
    }

    {
        System.out.println("Parent init block 2");
    }

    public Parent() {
        System.out.println("Parent constructor without parameters");
    }

    public Parent(int a) {
        this.a = a;
        System.out.println("Parent constructor with parameter a = " + a);
    }

    private void init() {
        System.out.println("Parent init");
    }

    public void someMethod() {
        System.out.println("Parent someMethod");
    }

    public static void someStaticMethod() {
        System.out.println("Parent someStaticMethod");
    }

}
