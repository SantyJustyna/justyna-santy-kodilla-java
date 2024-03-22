package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {

    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity(){
            BigDecimal total = continents.stream()
                    .flatMap(continent ->continent.getCountries().stream())
                    .map(Country::getPeopleQuantity)
                    .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

            return total;
    }
}
