package com.ua.rush.module1.lesson14;

public class Car {

    private String name;
    private Engine engine;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public static class Transmission {

        public static class Gear {
            private int number;
            private double ratio;

            public Gear(int number, double ratio) {
                this.number = number;
                this.ratio = ratio;
            }
        }

        public void changeGear(int gear) {

        }
    }

    public class Engine {
        private String name;
        private double power;

        public Engine(String name, double power) {
            this.name = name;
            this.power = power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "name='" + name + '\'' +
                    ", power=" + power +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
