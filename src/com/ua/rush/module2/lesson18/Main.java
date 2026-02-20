package com.ua.rush.module2.lesson18;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        SuperUtil superUtil = new SuperUtil();
//
//        superUtil.superCalculate();
//
//        superUtil.calculate(1, 2, 4, 4859, 489, 54);
//        superUtil.calculate(List.of(1, 2, 3), List.of(4, 5, 6));

        User u1 = new User();
        u1.setAge(20);
        u1.setFirstName("John");
        u1.setLastName("Doe");
        System.out.println(u1);

        User u2 = User.builder()
                .age(20)
                .firstName("John")
                .lastName("Doe")
                .mark(4)
                .mark(3)

      //          .
                .build();
        System.out.println(u2);

//        u2.
    }
}
