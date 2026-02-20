package com.ua.rush.module1.lesson8;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Lesson8 {

    public static void main(String[] args) {
//        int[][] array = new int[5][5];
//
////        array[0][0] = -9;
////        array[0][1] = 3;
////        array[0][2] = 8;
////
////        System.out.println(array[0][0]);
////        System.out.println(array[0][1]);
////
//        Random random = new Random();
////
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = random.nextInt(10);
//            }
//        }
//
//        System.out.println("Array:");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//
//        int sum = 0;
//        System.out.print("Main diagonal:\t\t\t");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    System.out.print(array[j][i] + "\t");
//                    sum += array[i][j];
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("Sum: " + sum);
//
//        System.out.print("Secondary diagonal:\t\t");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    System.out.print(array[j][i] + "\t");
//                }
//            }
//        }
//        System.out.println();
//
//        System.out.print("Upper main diagonal:\t");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i < j) {
//                    System.out.print(array[i][j] + "\t");
//                }
//            }
//        }
//        System.out.println();
//
//        System.out.print("Lower main diagonal:\t");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i > j) {
//                    System.out.print(array[i][j] + "\t");
//                }
//            }
//        }
//        System.out.println();
//
//        System.out.print("Even numbers:\t\t\t");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] % 2 == 0) {
//                    System.out.print(array[i][j] + "\t");
//                }
//            }
//        }
//        System.out.println();
//        System.out.print("Odd numbers:\t\t\t");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] % 2 != 0) {
//                    System.out.print(array[i][j] + "\t");
//                }
//            }
//        }
//        System.out.println();
//
//        System.out.print("Even numbers in main diagonal:\t\t\t");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                boolean isMainDiagonal = i == j;
//                boolean isEvenNumber = array[i][j] % 2 == 0;
//                if (isMainDiagonal && isEvenNumber) {
//                    System.out.print(array[i][j] + "\t");
//                }
//            }
//        }
//        System.out.println();


//
//        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {4 ,5}, {1, 2, 3, 4}};
//
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(arr2[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] arr3 = new int[3][];
//        arr3[0] = new int[3];
//        arr3[1] = new int[2];
//        arr3[2] = new int[4];
//
//        for (int i = 0; i < arr3.length; i++) {
//            for (int j = 0; j < arr3[i].length; j++) {
//                System.out.print(arr3[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][][] arr4 = new int[3][2][3];
//        for (int i = 0; i < arr4.length; i++) {
//            for (int j = 0; j < arr4[i].length; j++) {
//                for (int k = 0; k < arr4[i][j].length; k++) {
//                    System.out.print(arr4[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//        int[][][][] arr5 = new int[3][2][2][3];
//        for (int i = 0; i < arr5.length; i++) {
//            for (int j = 0; j < arr5[i].length; j++) {
//                for (int k = 0; k < arr5[i][j].length; k++) {
//                    for (int l = 0; l < arr5[i][j][k].length; l++) {
//                        System.out.print(arr5[i][j][k][l] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


        int[] arr = new int[100];
        var random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        System.out.println();

        Instant start = Instant.now();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }

    }


}
