package com.ua.rush.module1.lesson20;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Day.MONDAY);
//        for (Day value : Day.values()) {
//            System.out.println(value);
//        }
//
//        System.out.println();
//        System.out.println(Day.valueOf("MONDAY"));
//        System.out.println(Day.getWeekendDays());
////        System.out.println(Day.FRIDAY.ordinal());
//        System.out.println(Day.getByName("Sunday"));
//        System.out.println(Day.getByName("SUNDAY"));
//        System.out.println(Day.getByName("I don't know"));

//        Person p1 = new Person("Ivan", "Ivanov", 20, Sex.MALE);
//
//        PersonDao personDao = PersonDao.getInstance();
//        personDao.save(p1);
        int a = 2;

        if (a == 1) {
            System.out.println("I choose 1");
        } else if (a == 2) {
            System.out.println("I choose 2");
        } else if (a == 3) {
            System.out.println("I choose 3");
        } else if (a == 4) {
            System.out.println("I choose 4");
        } else if (a == 5) {
            System.out.println("I choose 5");
        } else {
            System.out.println("I choose default");
        }
        System.out.println("------------------");

        switch (a) {
            case 1: {
                System.out.println("I choose 1");
                break;
            }
            case 2:
                System.out.println("I choose 2");
                break;
            case 3:
                System.out.println("I choose 3");
                break;
            case 4:
                System.out.println("I choose 4");
                break;
            case 5:
                System.out.println("I choose 5");
                break;
            default:
                System.out.println("I choose default");
        }

        double d1 = 5.6d;
        long l1 = 5_000_000_000L;

        var s1 = Sex.FEMALE;
        switch (s1) {
            case Sex.MALE:
                System.out.println("I choose MALE");
                break;
            case Sex.FEMALE:
                System.out.println("I choose FEMALE");
                break;
            default:
                System.out.println("I choose nothing");
                break;
        }


    }
}
