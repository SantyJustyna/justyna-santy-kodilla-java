package com.kodilla.good.patterns.challenges;

public class FoodConfirmationService implements ConfirmationService {
    @Override
    public String confirmOrder() {
        return "Order confirmed!!!";
    }
}
