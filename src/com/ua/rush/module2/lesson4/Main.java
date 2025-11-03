package com.ua.rush.module2.lesson4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Flyable o1 = new Bird();
//        Flyable o2 = new Plane();
//        o1.fly();
//        o2.fly();

//        o1.sing();
//        o2.refuel();

//        Collection<Integer> c1 = new ArrayDeque<>();
//        c1.add(5);
//        c1.add(6);
//        c1.add(8);
//        c1.add(9);
//
////        System.out.println(c1.get(0));
//        System.out.println();
////        System.out.println(c1);
//
//        var iterator = c1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        Eatable e1 = new Bird();
//        e1.eatBanana();

        new Printable() {
            @Override
            public void printInfo() {
                System.out.println("Printable");
            }
        }.printInfo();

        ((Printable) () -> System.out.println("Printable")).printInfo();

        System.out.println(A.DATA);
        System.out.println(B.DATA);

    }
}
