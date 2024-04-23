package com.kodilla;

import com.kodilla.good.patterns.challenges.*;

public class Main {
    public static void main(String[] args) {

        OrderProcessor processor = new OrderProcessor();
        Order order = processor.process();

        ProductOrderService productOrderService = new ProductOrderService(new Messenger(), new AccessoriesTradingService(), new AccessoriesTradingRepository());
        productOrderService.process(order);
    }
}