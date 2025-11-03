package com.ua.rush.module2.lesson8.mapper;

import com.ua.rush.module2.lesson8.domain.Purchase;

public interface PurchaseMapper {

    static Purchase fromLine(String[] it) {
        var name = it[0];
        var amount = Double.parseDouble(it[1]);
        var category = it[2];

        return new Purchase(name, amount, category);
    }

}
