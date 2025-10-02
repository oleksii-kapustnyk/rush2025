package com.ua.rush.lesson13;

public class Person {

    protected int age;
    protected String firstName;

    public Person() {
    }

    public Person(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person info{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }

}
