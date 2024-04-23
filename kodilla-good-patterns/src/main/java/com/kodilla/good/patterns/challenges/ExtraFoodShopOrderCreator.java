package com.kodilla.good.patterns.challenges;

public class ExtraFoodShopOrderCreator implements OrderCreator {
    @Override
    public boolean process(OrderDetails orderDetails) {
        if (orderDetails.getSupplier().getSupplierName().equals("ExtraFoodShop")) {
            return true;
        } else {
            System.out.print("Check the order, wrong supplier");
            return false;
        }
    }
}
