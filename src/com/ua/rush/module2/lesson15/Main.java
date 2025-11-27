package com.ua.rush.module2.lesson15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
//        Car c1 = new Car();
//        Car.Engine ce1 = c1.new Engine(200);
//        Car.Engine ce2 = c1.new Engine(200);
//
//        c1.setColor("Red");
//        c1.setName("Toyota");
//        c1.setEngine(ce1);
//
//        Order order1 = new Order();
//        order1.setId(UUID.randomUUID().toString());
//        order1.addItem(2, 9.99, "Book");
//        order1.addItem(1, 78.5, "Notebook");
//
//        order1.setAddress("info@gmail.com", "123 Main St", "John Doe");
//
//        System.out.println(order1);
//
//        System.out.println(order1.getAddress().getEmail());

     //   User u1 = new User();
//        u1.setAge(25);
//        u1.setName("John");
//        u1.setEmail("info@gmail.com");

        User u1 = new User.Builder()
                .email("info@gmail.com")
                .name("John")
                .age(25)
                .build();

        System.out.println(u1);

        List<Integer> l1 = new ArrayList<>();

        l1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        l1.sort((o1, o2) -> 0);

        class Info {
            int age;
            String name;
            String email;
        }



    }
}
