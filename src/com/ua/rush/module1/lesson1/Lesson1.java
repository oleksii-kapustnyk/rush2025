package com.ua.rush.module1.lesson1;

//comment
public class Lesson1 {

    public static final int MY_FINAL_VARIABLE = 6;

    /**
     * @param args
     */
    public static void main(String[] args) { //comment
        //start
        //TODO check if equals
        System.out.println("Helo Rush!!!");
        ////
        int a = 5;
//        Integer i = 5;
        System.out.println(a);
        int x = 1;
        x = a;
        // System.out.println(x);
        double b = 5.5;
        System.out.println(b);
        String s = """
                sljkdhsjdfghsiudj
                aws;djhwsdiujg
                wsd;kljhwqd;jwhqd;lkwqjhdqwiolkdhqwuidhwjikldhwjdhw'
                wdwujidwiujdghwiudwuiduhi
                """;
        System.out.println(s);

        byte b1 = 100;
        System.out.println(b1);
        float f = 5.5f;

        long l = 10_000_000_000L;

        boolean bol1 = true;
        boolean bol2 = false;

        char c = '\u1924';
        System.out.println(c);
        System.out.println();
        int n1 = 5;
        int n2 = 3;
        double dd = 5;
        double dd2 = 3;
        double d1 = dd / dd2;
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(d1);

        System.out.println(n1 % n2);
        System.out.println();
        int n3 = 5;
//        n3--;
        System.out.println(n3++);
        System.out.println(n3);
        System.out.println(++n3 + n2++ + ++n1 - --n3);

        System.out.println();
        int shvidkist = 55;


        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2);

        System.out.println();
        String s3 = "123";
        int n4 = Integer.parseInt(s3);
        System.out.println(s3);
        System.out.println(n4);
        System.out.println();
        //my comment
        String s4 = "Number: ";
        int n5 = 5;
        String s5 = s4 + n5;
        System.out.println(s5);
        System.out.println(s5.length());
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());


    }

}
