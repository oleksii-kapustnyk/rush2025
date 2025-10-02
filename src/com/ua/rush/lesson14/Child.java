package com.ua.rush.lesson14;

public class Child extends Parent {

    static {
        System.out.println("Child static block");
    }

    static {
        System.out.println("Child static block 2");
    }

    {
        System.out.println("Child block 1");
    }

    {
        System.out.println("Child block 2");
    }

    private int b;

    public Child() {
//        super();
        System.out.println("Child constructor without parameters");
    }

    public Child(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("Child constructor with parameters a = " + a + ", b = " + b);
    }

//    @Override
    public static void someStaticMethod() {
        System.out.println("Child static method");
    }

    @Override
    public void someMethod() {
        System.out.println("Child someMethod");
    }

}
