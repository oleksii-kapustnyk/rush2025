package com.ua.rush.lesson20;

public class PersonDao {

    private static final PersonDao INSTANCE = new PersonDao();

    public static PersonDao getInstance() {
        return INSTANCE;
    }

    private PersonDao() {
        //create connection
    }

    public void save(Person person) {
        System.out.println("Saving " + person.getFirstName() + " " + person.getLastName() + " to DB");
    }

}
