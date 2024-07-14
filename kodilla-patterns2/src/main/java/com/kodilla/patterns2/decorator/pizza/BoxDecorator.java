package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BoxDecorator extends AbstractPizzaDecorator {
    public BoxDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + ", take-out (box)";
    }
}
