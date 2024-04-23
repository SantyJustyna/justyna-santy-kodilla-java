package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class OrderDetails {
    Supplier supplier;
    Product product;

    public OrderDetails(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
