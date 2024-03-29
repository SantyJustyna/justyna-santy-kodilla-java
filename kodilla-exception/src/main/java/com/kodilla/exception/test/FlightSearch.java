package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    private Map<String, Boolean> airports;

    public FlightSearch(Map<String, Boolean> airports) {
        this.airports = airports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (airports.containsKey(flight.getArrivalAirport())){

            if (airports.get(flight.getArrivalAirport())) {
                System.out.println(flight.getArrivalAirport() + ": arrival possible!!");
            } else System.out.println(flight.getArrivalAirport() + ": departures only!!");

        } else {
            throw new RouteNotFoundException("Airport not found!!");
        }
    }
}
