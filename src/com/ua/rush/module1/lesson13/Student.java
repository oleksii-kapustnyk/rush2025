package com.ua.rush.module1.lesson13;

public class Student extends Person {

    private String groupName; //GOOD

    private int info = 5;
    private int info2;

    public int course; //BAD

    public Student(int age, String firstName, String groupName) {
        super(age, firstName);
        this.groupName = groupName;
        info2 = 10;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupName='" + groupName + '\'' +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
