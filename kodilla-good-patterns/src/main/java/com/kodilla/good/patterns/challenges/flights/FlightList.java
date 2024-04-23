package com.kodilla.good.patterns.challenges.flights;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public final class FlightList {
    private final List<Flight> theFlightList = new ArrayList();

    public FlightList(){
        theFlightList.add(new Flight("Gdańsk", "Warszawa"));
        theFlightList.add(new Flight("Gdańsk", "Wrocław"));
        theFlightList.add(new Flight("Warszawa", "Wrocław"));
        theFlightList.add(new Flight("Warszawa", "Kraków"));
        theFlightList.add(new Flight("Kraków", "Poznań"));
        theFlightList.add(new Flight("Kraków", "Gdańsk"));
    }

    public List<Flight> getList(){
        return new ArrayList<>(theFlightList);
    }



}
