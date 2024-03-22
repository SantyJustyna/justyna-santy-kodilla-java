package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {

    private final String contName;
    private final List<Country> countries;

    public Continent(String contName, List<Country> countries) {
        this.contName = contName;
        this.countries = countries;
    }

    public String getContName() {
        return contName;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
