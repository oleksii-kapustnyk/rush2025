package com.ua.rush.module2.lesson7;

import java.util.Comparator;

public class FruitPriceReverseComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }

}
