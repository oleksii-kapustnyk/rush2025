package com.ua.rush.lesson14;

public class PersonDto {

    private int age;
    private String lastName;
    private Address address;
    private String firstName;
    private Passport passport;

    public class Address {
        private String city;
        private String street;
        private int houseNumber;
    }

    public class Passport {
        private String series;
        private String number;
    }


}
