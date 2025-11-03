package com.ua.rush.module2.lesson8;

import com.ua.rush.module2.lesson8.dao.PurchaseDao;
import com.ua.rush.module2.lesson8.dao.PurchaseFileDao;

public class Main {

    public static void main(String[] args) {
        PurchaseDao purchaseFileDao = new PurchaseFileDao("1.txt");
        var data = purchaseFileDao.findAll();

        data.forEach(System.out::println);
        System.out.println();
        System.out.println("Max amount: " + purchaseFileDao.maxPurchaseAmount());
        System.out.println("Min amount: " + purchaseFileDao.minPurchaseAmount());
        System.out.println("Average amount: " + purchaseFileDao.averagePurchaseAmount());
        System.out.println("Max purchase: " + purchaseFileDao.findWithMaximalAmount());
        System.out.println("Min purchase: " + purchaseFileDao.findWithMinimalAmount());
        System.out.println("Grouped by customer: ");
        purchaseFileDao.findAllGroupedByCustomer().forEach((k, v) -> System.out.println("\t" + k + ": " + v));
        System.out.println("Grouped by category: ");
        purchaseFileDao.findAllGroupedByCategory().forEach((k, v) -> System.out.println("\t" + k + ": " + v));
    }
}
