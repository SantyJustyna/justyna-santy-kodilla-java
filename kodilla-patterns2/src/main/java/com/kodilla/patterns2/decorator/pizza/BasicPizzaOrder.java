package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(20);
    }
    @Override
    public String getIngredients() {
        return "Mozzarella, tomato sauce";
    }
}
