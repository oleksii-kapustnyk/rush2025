package com.ua.rush.module1.lesson13;

public class Lesson13_1 {

    private static PersonService personService = new PersonService();

    public static void main(String[] args) {
//        MainService mainService = new MainService();
//        mainService.doWork();
//        Object obj = new Object();
//
//        Person p2 = new Person(20, "Ivan");
//        System.out.println(p1.toString());
//        System.out.println(p1 == p2);
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p1.equals(p2));
////        Person p1 = new Person();
//        System.out.println();
//
//        Student s1 = new Student(18, "Mariia", "n1");
//        System.out.println(s1);
      //  PersonService personService = new PersonService();

        Person p1 = new Person(20, "Ivan");
        Person p2 = new Person(30, "Serhii");
        Person[] persons = {p1, p2};

        personService.printPersonArray(persons);
        int maxAge = personService.findMaximumAge(persons);
        System.out.println(maxAge);

    }


}
