package com.ua.rush.module2.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private Address address;
    private List<OrderItem> items = new ArrayList<>();

    public class Address {
        private String email;
        private String shipAddress;
        private String customerName;

        public Address(String email, String shipAddress, String customerName) {
            this.email = email;
            this.shipAddress = shipAddress;
            this.customerName = customerName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getShipAddress() {
            return shipAddress;
        }

        public void setShipAddress(String shipAddress) {
            this.shipAddress = shipAddress;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "email='" + email + '\'' +
                    ", shipAddress='" + shipAddress + '\'' +
                    ", customerName='" + customerName + '\'' +
                    '}';
        }
    }

    public class OrderItem {
        private int quantity;
        private double price;
        private String product;

        public OrderItem(int quantity, double price, String product) {
            this.quantity = quantity;
            this.price = price;
            this.product = product;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        @Override
        public String toString() {
            return "OrderItem{" +
                    "quantity=" + quantity +
                    ", price=" + price +
                    ", product='" + product + '\'' +
                    '}';
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(int quantity, double price, String product) {
        var item = new OrderItem(quantity, price, product);
        items.add(item);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String email, String shipAddress, String customerName) {
        this.address = new Address(email, shipAddress, customerName);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", address=" + address +
                ", items=" + items +
                '}';
    }
}
