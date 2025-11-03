package com.ua.rush.module2.lesson5;

import java.util.ArrayList;
import java.util.List;

public class StorageRepository<T> {

    private List<T> list = new ArrayList<>();

    public void add(T object) {
        list.add(object);
    }

    public List<T> findAll() {
        return list;
    }

}
