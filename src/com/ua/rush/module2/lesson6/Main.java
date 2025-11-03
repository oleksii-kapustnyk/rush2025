package com.ua.rush.module2.lesson6;

import com.ua.rush.lesson20.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(-7);
        l1.add(0);
        l1.add(12);

//        List<Integer> res1 = new ArrayList<>();
//
//        for (Integer i : l1) {
//           if (i > 0) {
//               res1.add(i * 3);
//           }
//        }
//
//        System.out.println("Original: " + l1);
//
//        List<Integer> res2 = new ArrayList<>();
//
//        for (Integer i : res1) {
//            if (i %2 == 0) {
//                res2.add(i);
//            }
//        }
//        System.out.println("Result 2: " + res2);
//int a = 9;
        var r1 = l1.stream()
                .filter(it -> it > 0)
                .map(it -> it * 3)
             //   .filter(it -> it % 2 == 0)
//                .limit(3)
//                .skip(1)
                .distinct()
                .peek(System.out::println)
               // .forEach(System.out::println)
                .collect(Collectors.toList());
//
//        System.out.println(r1);
//
//        var r2 = r1.stream()
//                .anyMatch(it -> it > 10);
//
//        System.out.println(r2);

//        var rep = new UserRepository();
//        Optional<Person> p1 = rep.findByName("Test");
//
//        if (p1.isPresent()) {
//            Person person = p1.get();
//            System.out.println(person.getLastName());
//        }
//
//        p1.ifPresent(System.out::println);
//        p1.ifPresent(person -> System.out.println(person.getLastName()));
//
//        Optional<Integer> op1 = l1.stream()
//                .filter(it -> it > 40)
//                .findFirst();
//
//        op1.ifPresent(System.out::println);

//        System.out.println(l1);
//
//        Collections.sort(l1, (o1, o2) -> o2.compareTo(o1));
//        Collections.sort(l1, Comparator.reverseOrder());
//        System.out.println(l1);
//
//        Comparator<Person> c1 = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return Integer.compare(o2.getAge(), o1.getAge());
//            }
//        };
//
//        Comparator<Person> c2 = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        };
//
//        var r3 = l1.stream()
//                .filter(it -> it > 2)
//                .sorted((o1, o2) -> o2.compareTo(o1))
//                .toList();
//
//        List<String> ls1 = new ArrayList<>();
//
//        ls1.add("qa");
//        ls1.add("as");
//        ls1.add("vyu");
//        ls1.add("qwe");
//        ls1.add("asd");
//
//        ls1.stream()
//                .sorted()
//                .forEach(System.out::println);

        List<Integer> input = new ArrayList<>();

        Random r = new Random(100);
        for (int i = 0; i < 10; i++) {
            input.add(r.nextInt(20) - 10);
        }

        System.out.println(input);


    }
}
