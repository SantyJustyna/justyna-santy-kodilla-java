package com.kodilla.exception.test;

import java.util.Optional;

public class FlightSearchRunner {

    public static void main(String[] args){

        FlightSearch flightSearch = new FlightSearch();
        Flight flight1 = new Flight("Warsaw", "Paris");

        try {
            flightSearch.findFlight(flight1);
        }catch(RouteNotFoundException e){
            System.out.println("Airport not found!!!");
        }
    }
}
