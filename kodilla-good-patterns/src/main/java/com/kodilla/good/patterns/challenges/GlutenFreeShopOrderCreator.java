package com.kodilla.good.patterns.challenges;

public class GlutenFreeShopOrderCreator implements OrderCreator {
    @Override
    public boolean process(final OrderDetails orderDetails) {
        if (orderDetails.getSupplier().getSupplierName().equals("GlutenFreeShop")) {
            return true;
        } else {
            System.out.println("Product not available - gluten free only!");
            return false;
        }
    }
}
