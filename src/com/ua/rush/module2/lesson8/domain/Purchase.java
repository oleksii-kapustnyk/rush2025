package com.ua.rush.module2.lesson8.domain;

public class Purchase {

    private String name;
    private double amount;
    private String category;

    public Purchase() {
    }

    public Purchase(String name, double amount, String category) {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Purchase purchase)) return false;

        return Double.compare(amount, purchase.amount) == 0 && name.equals(purchase.name) && category.equals(purchase.category);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Double.hashCode(amount);
        result = 31 * result + category.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}
