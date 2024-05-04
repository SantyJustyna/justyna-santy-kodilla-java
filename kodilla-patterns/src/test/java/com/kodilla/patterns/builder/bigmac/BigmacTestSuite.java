package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("regular")
                .burgers(3)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("cucumber")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsNumber = bigmac.getIngredients().size();

        //Then
        assertEquals(3, ingredientsNumber);
    }
}
