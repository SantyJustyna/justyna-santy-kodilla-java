package com.kodilla.good.patterns.challenges;

public class HealthyShopOrderCreator implements OrderCreator {
    @Override
    public boolean process(OrderDetails orderDetails) {
        if (orderDetails.getSupplier().getSupplierName().equals("Healthy Shop")) {
            return true;
        } else {
            System.out.println("Healthy Shop!! You will not buy sweets here!!!");
            return false;
        }
    }
}
