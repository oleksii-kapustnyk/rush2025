package com.ua.rush.module2.lesson6;

import com.ua.rush.module1.lesson20.Person;

import java.util.Optional;

public class UserRepository {

    Optional<Person> findByName(String name) {
     // select * from users where name = name

      //  return new Person(name, "B", 1, Sex.MALE);
        return Optional.empty();
    }
}
