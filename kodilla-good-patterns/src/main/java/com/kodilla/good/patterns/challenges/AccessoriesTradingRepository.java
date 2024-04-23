package com.kodilla.good.patterns.challenges;

public class AccessoriesTradingRepository implements TradingRepository {
    @Override
    public void createOrder(User user, int orderNumber) {
        System.out.println("Order number " + orderNumber + " / " + user + " created.");
    }
}
