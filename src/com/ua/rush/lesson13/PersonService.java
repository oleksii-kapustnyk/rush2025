package com.ua.rush.lesson13;

public class PersonService {

    public void printPersonArray(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    public int findMaximumAge(Person[] persons) {
        int maxAge = persons[0].getAge();
        for (Person person : persons) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }

        return maxAge;
    }

}
