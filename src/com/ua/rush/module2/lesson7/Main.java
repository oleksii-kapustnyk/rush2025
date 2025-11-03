package com.ua.rush.module2.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Circle c1 = new Circle(1.1);
////        Circle c2 = new Circle(1.4);
////
////      //  System.out.println(c1.equals(new Object()));
////
////        if (new Object() instanceof Circle p) {
////            System.out.println("yes");
////        } else {
////            System.out.println("no");
////        }


        String s = "Apple";

//        if (s.equals("Apple")) {
//            System.out.println("This is apple");
//        } else if (s.equals("Banana")) {
//            System.out.println("This is banana");
//        } else if (s.equals("Pineapple")) {
//            System.out.println("This is pineapple");
//        } else if (s.equals("Raspberry")) {
//            System.out.println("This is raspberry");
//        } else {
//            System.out.println("Unknown fruit");
//        }

//        int result;
//        switch (s) {
//            case "Apple":
//                System.out.println("This is apple");
//                result = 1;
//                break;
//            case "Banana":
//                System.out.println("This is banana");
//                result = 2;
//                break;
//            case "Pineapple":
//                System.out.println("This is pineapple");
//                break;
//            case "Raspberry":
//                System.out.println("This is raspberry");
//                break;
//            default:
//                System.out.println("Unknown fruit");
//        }
//
//        switch (s) {
//            case "Apple" -> System.out.println("This is apple");
//            case "Banana" -> System.out.println("This is banana");
//            case "Pineapple" -> System.out.println("This is pineapple");
//            case "Raspberry" -> System.out.println("This is raspberry");
//            default -> System.out.println("Unknown fruit");
//        }
//
//        var res = switch (s) {
//            case "Apple" -> "This is apple";
//            case "Banana" -> "This is banana";
//            case "Pineapple" -> "This is pineapple";
//            case "Raspberry" -> "This is raspberry";
//            default -> "Unknown fruit";
//        };
//
//        String category = switch (s) {
//            case "Apple", "Banana", "Raspberry" -> "Common fruit";
//            case "Pineapple" -> "Tropical fruit";
//            default -> "Unknown";
//        };
//
//        System.out.println(category);
//
//        String message = switch (s) {
//            case "Apple" -> {
//                System.out.println("Calculating...");
//                System.out.println("Some work");
//                yield "This is apple";
//            }
//            case "Banana" -> "This is banana";
//            default -> "Unknown fruit";
//        };


        List<List<String>> list = List.of(
                List.of("Raspberry"),
                List.of("Apple", "Banana"),
                List.of("Pineapple", "Orange")
        );

        //  System.out.println(list);

        var oneList = list.stream()
                .flatMap(List::stream)
                .toList();
        //    System.out.println(oneList);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Orange", 1.0));
        fruits.add(new Fruit("Apple", 2.0));
        fruits.add(new Fruit("Pineapple", 3.0));
        fruits.add(new Fruit("Apple", 1.5));

        Map<String, Double> fruitMap = fruits.stream()
                .peek(it -> it.setPrice(it.getPrice() * 1.1))
                .collect(Collectors.toMap(Fruit::getName,
                        Fruit::getPrice,
                        (oldValue, newValue) -> newValue,
                        LinkedHashMap::new));

//        System.out.println(fruitMap);

        Collections.sort(fruits, new FruitPriceComparator());

        System.out.println(fruits);

        Collections.sort(fruits, new FruitPriceReverseComparator());

        System.out.println(fruits);


    }
}
