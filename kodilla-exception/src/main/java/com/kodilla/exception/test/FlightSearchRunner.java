package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlightSearchRunner {

    public static void main(String[] args){

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Madrid", true);
        airports.put("Warsaw", true);
        airports.put("Paris", false);
        airports.put("Porto", false);


        FlightSearch flightSearch = new FlightSearch(airports);
        Flight flight1 = new Flight("Paris", "dhgsdh");

        try {
            flightSearch.findFlight(flight1);
        }catch(RouteNotFoundException e){
            System.out.println("Airport not found!!!");
        }
    }
}
