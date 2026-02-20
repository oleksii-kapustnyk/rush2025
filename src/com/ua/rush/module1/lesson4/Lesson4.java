package com.ua.rush.module1.lesson4;

public class Lesson4 {

    public static void main(String[] args) {
        int a = 50;
        int b = 490;

//        if (a == b) {
//            if (a > b) {
//                System.out.println("a > b");
//            } else {
//                if (a < b) {
//                    System.out.println("a < b");
//                }
//            }
//            System.out.println("a == b");
//        } else if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a < b");
//        }

        boolean b1 = 1 == 1;
        boolean b3 = 2 > 3;
        boolean b4 = 2 < 3;
        boolean b5 = 2 != 3;
        boolean b6 = 3 <= 3;
        boolean b7 = 3 >= 3;

//        if (!b1) {
//            System.out.println("b1 true");
//        }

        boolean myBol = (a < b) || (a < 10);
        boolean b9 = (a < b) || (a < 10);
        boolean myBol2 = b9 && (b > 20);
//
//        boolean isNewCustomer = ((a < b) || (a < 10)) && (b > 20);
//        if (isNewCustomer) {
//            System.out.println("isNewCustomer");
//        }
//
//        boolean isNewOrRecoveredPhone = true;
//        boolean isNewOrRecoveredEmail = true;
//        boolean isReferred = true;
//        boolean isNewCustomer = isNewOrRecoveredPhone || isNewOrRecoveredEmail || isReferred;
//
//        if (isNewCustomer) {
//            System.out.println("isNewCustomer");
//        }

//        int x = 10;
//
//        if (x++ == 10) {
//            System.out.println("x == 10");
//        } else {
//            System.out.println("x = " + x);
//        }
//
//        System.out.println(x);

//        int salary = 1000;
//        int taxes;
//        if (salary < 200) {
//            taxes = 5;
//        } else {
//            taxes = 10;
//        }
//        int taxes = salary < 200 ? 5 : 10;
//
//        System.out.println(taxes);

        String name1 = new String("   ");
        String name2 = "Ivaq";

//        System.out.println(name1 == name2);
//        System.out.println(name1.equals(name2));

        int name1Length = name1.length();
//        System.out.println(name1Length);

        if (name1.length() > name2.length()) {
            System.out.println("name1.length() > name2.length()");
        } else {
            System.out.println("name1.length() < name2.length()");
        }

    }
}
