package com.kodilla.good.patterns.challenges;

import java.util.concurrent.Callable;

public class Food2Door {

    public static void main(String[] args) {

        OrderDetails order = new OrderDetails(new Supplier("Healthy Shop"), new Product("bananas", 4));
        FoodConfirmationService service = new FoodConfirmationService();
        OrderCreator orderCreator = new HealthyShopOrderCreator();
        boolean processed = orderCreator.process(order);
        if (processed) {
            System.out.print(service.confirmOrder());
        }

    }


}
