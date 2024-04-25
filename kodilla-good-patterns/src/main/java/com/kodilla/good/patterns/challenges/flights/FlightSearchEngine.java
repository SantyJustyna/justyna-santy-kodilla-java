package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {


    public List<Flight> findFlightsFrom(FlightList flightList, String departureCity) {

        List<Flight> listFrom = flightList.getList().stream()
                .filter(s -> s.getDepartureAirport().equals(departureCity))
                .collect(Collectors.toList());

        return listFrom;

    }

    public List<Flight> findFlightsTo(FlightList flightList, String arrivalCity) {

        List<Flight> listTo = flightList.getList().stream()
                .filter(s -> s.getArrivalAirport().equals(arrivalCity))
                .collect(Collectors.toList());

        return listTo;

    }

    public List<Flight> findFlightThrought(FlightList flightList, String departureCity, String throught, String arrivalCity) {

        List<Flight> listThrought1 = flightList.getList().stream()
                .filter(s -> s.getDepartureAirport().equals(departureCity) && s.getArrivalAirport().equals(throught))
                .collect(Collectors.toList());

        List<Flight> listThrought2 = flightList.getList().stream()
                .filter(a -> a.getDepartureAirport().equals(throught) && a.getArrivalAirport().equals(arrivalCity))
                .collect(Collectors.toList());

        List<Flight> finalList = new ArrayList<>();
        finalList.addAll(listThrought1);
        finalList.addAll(listThrought2);

        return finalList;
    }

    public static void main(String[] args) {
        FlightSearchEngine engine = new FlightSearchEngine();

        System.out.println(engine.findFlightsFrom(new FlightList(), "Gdańsk"));
        System.out.println(engine.findFlightsTo(new FlightList(), "Kraków"));
        System.out.println(engine.findFlightThrought(new FlightList(), "Warszawa", "Kraków", "Poznań"));

    }

}
