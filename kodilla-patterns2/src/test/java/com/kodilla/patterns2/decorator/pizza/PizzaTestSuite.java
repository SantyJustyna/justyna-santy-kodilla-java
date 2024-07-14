package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {
    @Test
    public void testPizzaPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new BoxDecorator(theOrder);

        //When
        BigDecimal price = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(37), price);
    }
    @Test
    public void testPizzaIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new BoxDecorator(theOrder);

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        assertEquals("Mozzarella, tomato sauce, ham, mushrooms, pepperoni, take-out (box)", ingredients);
    }
}
