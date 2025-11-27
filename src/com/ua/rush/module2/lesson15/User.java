package com.ua.rush.module2.lesson15;

public class User {

    private final int age;
    private final String name;
    private final String email;

    private User(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.email = builder.email;
    }

    public static class Builder {
        private int age;
        private String name;
        private String email;

        abstract class Q {
            class AA {

            }

            abstract class BB {
                static class NN {

                }
            }
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
