package com.ua.rush.module2.lesson8.dao;

import com.ua.rush.module2.lesson8.domain.Purchase;
import com.ua.rush.module2.lesson8.mapper.PurchaseMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class PurchaseFileDao implements PurchaseDao {

    private static final String DEFAULT_PATH_TO_FILE = "pur.txt";
    private String pathToFile;

    private final List<Purchase> purchases;

    public PurchaseFileDao() {
        this.purchases = findAll();
    }

    public PurchaseFileDao(String pathToFile) {
        this.pathToFile = pathToFile;
        this.purchases = findAll();
    }

    @Override
    public List<Purchase> findAll() {
        try {
            return Files.readAllLines(Paths.get(getPathToFile())).stream()
                    .map(it -> it.split(","))
                    .map(PurchaseMapper::fromLine)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public double maxPurchaseAmount() {
        return purchases.stream()
                .mapToDouble(Purchase::getAmount)
                .max()
                .orElse(0);
    }

    @Override
    public double minPurchaseAmount() {
        return purchases.stream()
                .mapToDouble(Purchase::getAmount)
                .min()
                .orElse(0);
    }

    @Override
    public double averagePurchaseAmount() {
        return purchases.stream()
                .mapToDouble(Purchase::getAmount)
                .average()
                .orElse(0);
    }

    @Override
    public Optional<Purchase> findWithMinimalAmount() {
        return purchases.stream()
                .min(Comparator.comparingDouble(Purchase::getAmount));
    }

    @Override
    public Optional<Purchase> findWithMaximalAmount() {
        return purchases.stream()
                .max(Comparator.comparingDouble(Purchase::getAmount));
    }

    @Override
    public Map<String, List<Purchase>> findAllGroupedByCustomer() {
        return purchases.stream()
                .collect(Collectors.groupingBy(Purchase::getName));
    }

    @Override
    public Map<String, List<Purchase>> findAllGroupedByCategory() {
        return purchases.stream()
                .collect(Collectors.groupingBy(Purchase::getCategory));
    }

    private String getPathToFile() {
        return Objects.requireNonNullElse(pathToFile, DEFAULT_PATH_TO_FILE);
    }

}
