package com.ua.rush.module1.lesson9;

import java.util.Random;

public class Lesson9 {

    public static void main(String[] args) {
//        int[] array = getRandomArray(5, 10);
//        printArray(array);
//        printArray(array);

    }

    public static void printInfo() {
        System.out.println("Hello World");
    }

//    public static int printInfo() {
//        System.out.println("Hello World");
//
//        return 1;
//    }

    public static void printInfo(String name) {
        name.getBytes();
        System.out.println("Hello World");
    }

    public static void printInfo(int age) {
        System.out.println("Hello World");
    }

    public static void printAge(int age) {
        System.out.println("You are " + age + " years old");
    }

    public static void printPersonInfo(String name, int age) {
        name = name.toUpperCase();
        System.out.println("Hello " + name + ", you are " + age + " years old");
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(10);

        return number;
    }

    public static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int[] getRandomArray() {
        return getRandomArray(10);
    }

    public static int[] getRandomArray(int size) {
        return getRandomArray(size, 10);
    }

    public static int[] getRandomArray(int size, int maxSize) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxSize);
        }

        return array;
    }
//
//    public static int getMaxvalue(int[] array) {
//        return value;
//    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        array[0] = -999;
        System.out.println();
    }

//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println();
//    }


}
