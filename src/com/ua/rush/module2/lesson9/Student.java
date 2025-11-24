package com.ua.rush.module2.lesson9;

import java.util.Objects;

public class Student implements Cloneable {

    private int age;
    private String name;
    private String group;
    private String email;

    public int a;

    public Student() {
    }

    public Student(int age, String name, String group, String email) {
        this.age = age;
        this.name = name;
        this.group = group;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;

        return age == student.age && Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(email, student.email);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm finalizing");
        super.finalize();
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(group);
        result = 31 * result + Objects.hashCode(email);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
