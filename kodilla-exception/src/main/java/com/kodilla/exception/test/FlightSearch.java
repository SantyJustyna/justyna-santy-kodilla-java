package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Paris", false);
        airports.put("London", true);
        airports.put("Porto", false);

        if(Boolean.TRUE.equals(airports.get(flight.getArrivalAirport()))) {
            System.out.println(flight.getArrivalAirport() + ": arrival possible!!");
        }
        if(Boolean.FALSE.equals(airports.get(flight.getArrivalAirport()))) {
            System.out.println(flight.getArrivalAirport() + ": departures only!!");
        }else{
            throw new RouteNotFoundException("Airport not found!");
        }
    }
}

