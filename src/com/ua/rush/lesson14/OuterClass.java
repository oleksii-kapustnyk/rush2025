package com.ua.rush.lesson14;

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
