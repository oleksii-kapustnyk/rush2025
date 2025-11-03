package com.ua.rush.module2.lesson8.dao;

import com.ua.rush.module2.lesson8.domain.Purchase;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PurchaseDao {

    List<Purchase> findAll();

    double maxPurchaseAmount();

    double minPurchaseAmount();

    double averagePurchaseAmount();

    Optional<Purchase> findWithMinimalAmount();

    Optional<Purchase> findWithMaximalAmount();

    Map<String, List<Purchase>> findAllGroupedByCustomer();

    Map<String, List<Purchase>> findAllGroupedByCategory();

}
