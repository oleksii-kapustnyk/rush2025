package com.ua.rush.module1.lesson21;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//
////        for (int i = 0; i < array.length; i++) {
////            System.out.println(array[i]);
////        }
//
//        int count = 0;
//        try {
//            System.out.println(array[10]);
////            double d = 10 / 0;
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("In exception block 1");
////            System.exit(0);
//        } finally {
//            System.out.println("In finally block");
//            count++;
//        }
//
//
//        System.out.println("last line");


//        try {
//            var data = Files.readAllBytes(new File("test.txt").toPath());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //  withException();

        int arr[] = generateArray(10);
        try {
            int max = getMax(arr);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private static int[] generateArray(int size) {
        var random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25 - 5 + 1) + 5;
        }
        return array;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        if (max > 15) {
            throw new ArithmeticException("Max is greater than 15");
        }

        return max;
    }

}
