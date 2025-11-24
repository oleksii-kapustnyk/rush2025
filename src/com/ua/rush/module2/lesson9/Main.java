package com.ua.rush.module2.lesson9;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(22, "Oleka", "QWEBNB67-5", "oleks@gmail.com");
        s1.setAge(23);

        System.out.println(s1);
        //   System.out.println(s1.hashCode());
        Student sClone = null;

        try {
            sClone = s1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(sClone);

//        s1.setName("Oleksii");
//        System.out.println(s1);
//        System.out.println(sClone);

//        System.gc();

//        System.out.println(sClone.hashCode());

//        System.out.println(s1.getClass());
//        System.out.println(s1.getClass().getName());
//        System.out.println(Arrays.toString(s1.getClass().getFields()));
////        System.out.println(Arrays.toString(s1.getClass().getConstructors()));
////        System.out.println(Arrays.toString(s1.getClass().getMethods()));
//        System.out.println(Arrays.toString(s1.getClass().getDeclaredFields()));
//        System.out.println(s1.getClass().getPackage());
////        System.out.println(Arrays.toString(s1.getClass().getDeclaredConstructors()));
////        System.out.println(Arrays.toString(s1.getClass().getDeclaredMethods()));
//
////        Class clazz = Integer.class;
//
//        Class<Student> c1 = (Class<Student>) s1.getClass();
//        System.out.println(c1);
//        Class clazz = int.class;
//        System.out.println(clazz);
//
//        try {
//            Class s = Class.forName("com.ua.rush.module2.lesson9.Student");
//            System.out.println(s);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        try {
            String s = String.class.newInstance();
            System.out.println(s.length());
            Method m = String.class.getMethod("length");
            int length = (int) m.invoke(s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String str1 = "Hello";
        str1 = "World";

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
       // sb.

        List<String> l1 = new ArrayList<>();
        l1.add("Hello");
        l1.remove(0);

        List<String> l2 = List.of("Hello");
//        l2.add("Hello");
        List<String> l3 = Collections.emptyList();
      //  l3.add("Hello");
    }

}
