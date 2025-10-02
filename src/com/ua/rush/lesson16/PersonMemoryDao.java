package com.ua.rush.lesson16;

import com.ua.rush.lesson13.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonMemoryDao {

    private List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public List<Person> findAll() {
        return personList;
    }

    public void delete(Person person) {
        personList.remove(person);
    }

    public void deleteAll() {
        personList.clear();
    }

    public List<Person> findAllByAge(int age) {
        List<Person> result = new ArrayList<>();

        personList.forEach(person -> {
//if then result.add(person)
            if (person.getAge() == age) {
                result.add(person);
            }
        });

//        personList.stream()
//                .filter(person -> person.getAge() == age)
//                .filter(person -> person.getFirstName().contains("R"))
//                .map(person -> person.getFirstName()  + " " + person.getAge())
//                .toList();

        return result;
    }


}
