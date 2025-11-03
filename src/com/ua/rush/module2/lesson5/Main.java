package com.ua.rush.module2.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//
//        list.add(5);
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        list.add("Hello");
//
//        for (int i = 0; i < list.size(); i++) {
//            Integer result = (Integer) list.get(i);
//            System.out.println(result);
//        }
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(5);
//        list2.add(6);
//        list2.add(8);
//        list2.add(9);
//     //   list2.add("Hello");
//
//        for (int i = 0; i < list2.size(); i++) {
//            Integer result = list2.get(i);
//            System.out.println(result);
//        }

//        Box<Integer> box = new Box<>();
//        box.setValue(1);
////        box.print();
//
//        var value = box.getValue();
//
//        System.out.println(value);
//
//        Integer[] arr1 = new Integer[5];
//        String[] arr2 = new String[5];
//        double[] arr3 = new double[5];
//        char[] arr4 = new char[5];
//
//        ArraysWork<Integer> arraysWork = new ArraysWork<>();
//        arraysWork.printArray(arr1);
//
//        StorageRepository<Car> carStorageRepository = new StorageRepository<>();
//        carStorageRepository.add(new Car("Toyota"));
//        carStorageRepository.add(new Car("Honda"));
//        carStorageRepository.add(new Car("Ford"));
//        carStorageRepository.add(new Car("Chevrolet"));
//        carStorageRepository.add(new Car("Dodge"));

//        ArraysWork aw = new ArraysWork();
//        aw.printArray(carStorageRepository.findAll().toArray());
//
//        NumberBox<Integer> mb = new NumberBox<>();
//        mb.setValue(1);
//        System.out.println(mb.getValue());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Number> dest = new ArrayList<>();
//        print(list);
        copy(list, dest);
        print(dest);

        List<?> list6 = new ArrayList<>();
        //  list6.add(1);




    }

    static void print(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void copy(List<? extends Number> src, List<? super Number> dest) {
        for (Number n : src) {
            dest.add(n);
        }
    }



}
