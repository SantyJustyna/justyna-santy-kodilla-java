package com.kodilla.good.patterns.challenges;

public class Item {
    String productType;
    int amount;

    public Item(String productType, int amount) {
        this.productType = productType;
        this.amount = amount;
    }

    public String getProductType() {
        return productType;
    }

    public int getAmount() {
        return amount;
    }
}
