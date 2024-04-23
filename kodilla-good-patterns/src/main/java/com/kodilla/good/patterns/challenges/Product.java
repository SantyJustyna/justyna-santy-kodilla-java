package com.kodilla.good.patterns.challenges;

public class Product {
    String productName;
    int amount;

    public Product(String productName, int amount) {
        this.productName = productName;
        this.amount = amount;
    }

    public String getProduct() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }
}
