package com.ua.rush.lesson22;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {

    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(5);
        q1.add(7);

        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
//        System.out.println(q1.element());
//        System.out.println(q1);
//        System.out.println(q1.remove());
//        System.out.println(q1);

        System.out.println(q1.getLast());
        System.out.println(q1);
        System.out.println(q1.peekLast());
        System.out.println(q1);
        System.out.println(q1.pollLast());
        System.out.println(q1);
        q1.push(10);
        System.out.println(q1);
        q1.addFirst(11);
        System.out.println(q1);
        q1.offer(87);
        System.out.println(q1);
        q1.addLast(99);
        System.out.println(q1);
//        q1.


    }


}
