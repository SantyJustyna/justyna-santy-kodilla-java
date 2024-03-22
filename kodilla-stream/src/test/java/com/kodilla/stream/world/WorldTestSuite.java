package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite{

    @Test
    void testGetPeopleQuantity(){
        //Given
        List<Country> countries1 = new ArrayList<>();
        countries1.add(new Country("Poland", new BigDecimal(37000000)));
        countries1.add(new Country("Germany", new BigDecimal(37000000)));
        countries1.add(new Country("France", new BigDecimal(37000000)));

        List<Country> countries2 = new ArrayList<>();
        countries2.add(new Country("Canada", new BigDecimal(99000000)));
        countries2.add(new Country("USA", new BigDecimal(99000000)));

        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Europe", countries1));
        continents.add(new Continent("North America", countries2));
        World world = new World(continents);

        //When
        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal(309000000), allPeople);

    }
}
