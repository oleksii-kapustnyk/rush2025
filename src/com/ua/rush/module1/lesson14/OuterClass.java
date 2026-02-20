package com.ua.rush.module1.lesson14;

public class OuterClass {

    private int a;
    private int b;
    private InnerClass innerClass;

    public class InnerClass {

        void someMethod() {
            System.out.println(a);
            System.out.println(b);
        }

    }


}
