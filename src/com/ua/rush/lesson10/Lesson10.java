package com.ua.rush.lesson10;

import com.ua.rush.lesson1.Lesson1;

import java.util.Arrays;

public class Lesson10 {

    private static final int MY_FINAL_VARIABLE = 6;
    int someSpecialNumber = 7;
    static int nameVariable = 8;

    public static void main(String[] args) {
        //    System.out.println(MY_FINAL_VARIABLE);
//        a = 4;
//        System.out.println(a);
//        f(null);
//        System.out.println(nameVariable);
//        f();

//        System.out.println("Hello World");
//        System.out.println("Hello\tWorld");
//        System.out.println("Hello\nWorld");
//        System.out.println("Hello\bWorld");
//        System.out.println("Hello\rWorld");
//        System.out.println("Hello\fWorld");
//        System.out.println("'Hello World'");
//        System.out.println("\"Hello World\"");
//        System.out.println("\\Hello World\\");
//        System.out.println("Hello World");
//
        String input = """
                edr;'lf jkeo;ifje  eflkhnejf
                ew;ld ikhe ekjkhfg weuyig
                wefdoio ehjfoi ;ewojidh quiodjhqw
                w;koldjh weioupfh weoldj ikhwdqkkopfjo
                we;oieh foiehif
                """;
//
//        String output = """
//                edr;'lfjkeo;ifje\n
//                eflkhnejf\n
//                ew;ldikhe\nekjkhfg weuyig\n
//                wefdoioehjfoi\n;ewojidhwquiodjhqw
//                w;koldjhweioupfh\nweoldjikhwdqkkopfjo\n
//                we;oiehfoiehif
//                """;

        String str = "     Helvo lWorld My life is he good he     ";
        System.out.println(str);
        System.out.println(str.length());
        String s2 = " ";
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());
        System.out.println(str.charAt(0));
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(str.getBytes());
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.indexOf("l", 3));
        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));
        System.out.println(str.startsWith("Helvo"));
        System.out.println(str.endsWith("good"));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 8));
        System.out.println(str.repeat(3));
        System.out.println(input.replace(" ","\n"));
        System.out.println(str.replaceAll("he", "wow"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());

        String st3 = " ksdujhikdfhe !!!!elujf rgr   ";
        String result = "ksdujhikdfheelujfrgr";
    }

    public void someMethod(int b) {
        String s = "er";
        s += s + "\n";
        final int a = 4;
        {
            int someVar = 0;
        }
        someSpecialNumber = 5;

    }

    public static void f() {
        int nameVariable = 9;
        System.out.println(Lesson10_2.MY_FINAL_VARIABLE);
        System.out.println(Lesson1.MY_FINAL_VARIABLE);
        System.out.println(Lesson10.nameVariable);
        System.out.println(nameVariable);
    }


}
