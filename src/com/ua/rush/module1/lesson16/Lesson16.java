package com.ua.rush.module1.lesson16;

import com.ua.rush.module1.lesson13.Person;

import java.util.ArrayList;
import java.util.List;

public class Lesson16 {

    public static void main(String[] args) {
//        int a = 6;
//        Integer i1 = new Integer(6);
//        Integer i2 = Integer.valueOf("5");
//        System.out.println(i1);
//        System.out.println(i2);
//
//        int a2 = i1;
//        Integer a3 = 7;
//        Integer a4 = Integer.valueOf(8);
//        Double d1 = new Double(5.5);
//        Long l1 = new Long(10L);
//        Float f1 = new Float(5.5f);
//        System.out.println(l1);
//        System.out.println(f1);
//        System.out.println(d1);
//        print1((Integer) 3);

//
//        List<Integer> l1 = new LinkedList<>();
//        System.out.println(l1);
//        l1.add(5);
//        System.out.println(l1);
//        l1.add(6);
//        l1.add(8);
//        l1.add(9);
//        System.out.println(l1);
//        System.out.println(l1.get(1));
//        System.out.println(l1.set(1, -9));
//        System.out.println(l1);
//        l1.remove(1);
//        System.out.println(l1);
//        System.out.println(l1.size());
//
//        for (int i = 0; i < 1000; i++) {
//            l1.add(i);
//        }
//
//        System.out.println(l1);
//
//        for (int i = 0; i < 900; i++) {
//            l1.remove(l1.size() - 1);
//        }
//
//        System.out.println();
//
//        System.out.println(l1);
//
//        System.out.println();
//        List<Person> l2 = new ArrayList<>();
//        l2.add(new Person(20, "Ivan"));
//        l2.add(new Person(30, "Serhii"));
//        System.out.println(l2);

//        List<int> l3 = new ArrayList<>();

//        l1.trimToSize();



        PersonMemoryDao personMemoryDao = new PersonMemoryDao();
        personMemoryDao.add(new Person(20, "Ivan"));
        personMemoryDao.add(new Person(30, "Serhii"));

        var result = personMemoryDao.findAll();
        Person p2 = result.get(0);
        System.out.println(result);

        List obj = new ArrayList();

        obj.add(new Person(20, "Ivan"));
        obj.add(new Person(30, "Serhii"));
        obj.add(8);

        System.out.println(obj);

        Person p1 = (Person) obj.get(0);
//        personMemoryDao.delete(new Person(20, "Ivan"));
//        personMemoryDao.deleteAll();

    }

//    static void print1(int a) {
//        System.out.println("int: " + a);
//    }
//
//    static void print1(Integer a) {
//        System.out.println("Integer: " + a);
//    }





}
