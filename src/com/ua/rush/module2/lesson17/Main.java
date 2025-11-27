package com.ua.rush.module2.lesson17;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//        System.out.println(reflection1.getName());
//        System.out.println(Arrays.toString(reflection1.getFields()));
//        System.out.println(Arrays.toString(reflection1.getDeclaredFields()));
//        System.out.println(Arrays.toString(reflection1.getMethods()));
//        System.out.println(Arrays.toString(reflection1.getDeclaredMethods()));

//        RefTest rt1 = new RefTest(1,2,3);
//
//        Class<? extends RefTest> reflection1 = rt1.getClass();
//
//        Method[] methods = reflection1.getDeclaredMethods();
//        for (Method method : methods) {
//            String s1 = "invoke";
//            method.setAccessible(true);
//            System.out.println(method);
//            try {
//                method.invoke(rt1, s1);
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            } catch (InvocationTargetException e) {
//                throw new RuntimeException(e);
//            }
//        }

        MathOps mathOps = new MathOpsImpl();

        MathOps proxy = (MathOps) Proxy.newProxyInstance(
                MathOps.class.getClassLoader(),
                new Class[] {MathOps.class},
                ((proxy1, method, args1) -> {
                    int value = (int) args1[0];
                    if (value < 0) {
                        throw new IllegalArgumentException("Value must be positive");
                    }

                    return method.invoke(mathOps, args1);
                })
        );

        System.out.println(proxy.doubleIt(5));
        System.out.println(proxy.doubleIt(-5));




    }


}
