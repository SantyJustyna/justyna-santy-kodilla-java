package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniDecorator extends AbstractPizzaDecorator {
    public PepperoniDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + ", pepperoni";
    }
}
