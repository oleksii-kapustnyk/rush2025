package com.ua.rush.module2.lesson4;

public class TestM implements A, B {

    @Override
    public void test() {
        System.out.println(A.DATA);
        A.super.test(); // 1
        B.super.test(); // 2
     //   System.out.println("TestM"); //3
    }
}
