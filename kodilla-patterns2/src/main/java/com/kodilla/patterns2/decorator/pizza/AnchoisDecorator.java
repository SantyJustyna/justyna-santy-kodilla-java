package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AnchoisDecorator extends AbstractPizzaDecorator {
    public AnchoisDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + ", anchois";
    }
}
