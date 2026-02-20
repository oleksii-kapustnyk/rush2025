package com.ua.rush.module1.lesson12;

public class Person {

    private int age;
    private String name;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayInfo() {
        System.out.println(name + " " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return 1;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
