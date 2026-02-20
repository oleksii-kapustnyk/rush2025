package com.ua.rush.module1.lesson7;

import java.util.Random;

public class Lesson7 {

    public static void main(String[] args) {
//        int[] array = new int[10];
//        int[] array2 = new int[] {1, 2, 3, 5, 7, 8, 9, 10};
//        System.out.println(array[0]);
//
//        array[0] = 1;
//        System.out.println(array[0]);
//        System.out.println(array2[3]);
//
//        System.out.println();
//        System.out.println("wsjdgwuyidgw".length());
//        System.out.println(array2.length);

//        for (int i = 0; i < array.length; i++) {
//            array[i] = (i + 1) * 3;
//        }


//        System.out.println(array[9]);
//        array[55] = 1000;

//        array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        int[] array = {1, 2, 3, 5, 7, 8, 9, 10};
//
////        array[0] = 1;
//        System.out.println(array[0]);

//
//        Random random = new Random();
//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(25 - 5 + 1) + 5;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        random.nextDouble()

//        String[] strArr = {"Hello", "World", "Java"};
//        String result = "";
//        for (int i = 0; i < strArr.length; i++) {
//            result = result + " " + strArr[i];
//        }
//        result = result.trim();
//        System.out.println(result);
//        System.out.println("----------------");
//
//        String[] strArr2 = result.split(" ");
//
//        for (int i = 0; i < strArr2.length; i++) {
////            System.out.println(strArr2[i]);
//            if (strArr2[i].equalsIgnoreCase("world")) {
//                System.out.println("World is here");
//            }
//        }

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25 - 5 + 1) + 5;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int maxElement = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Max element: " + maxElement);
        System.out.println("Max index: " + maxIndex);
    }
}
