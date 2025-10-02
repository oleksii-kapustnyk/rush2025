package com.ua.rush.lesson22;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
//        int a = 5;
//        int b = -9;
//        int maxNumber = 0;
//        try {
//            maxNumber = getMaxNumber(a, b);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(maxNumber);

        File file = new File("test.txt");
        InputStream is = null;
        try {
            is = new BufferedInputStream(new DataInputStream(new FileInputStream(file)));
            var data = new String(is.readAllBytes());
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("------------------");


        try (InputStream is2 = new FileInputStream("test.txt");
             InputStream is3 = new FileInputStream("test.txt")) {
            var data = new String(is2.readAllBytes());
            System.out.println(data);
        } catch (Exception e) {

        }
    }

    private static int getMaxNumber(int a, int b) throws NegativeInputException {
        if (a < 0) {
            throw new NegativeInputException("a is negative");
        }
        if (b < 0) {
            throw new NegativeInputException("b is negative");
        }

        if (a == b) {
            return a;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
