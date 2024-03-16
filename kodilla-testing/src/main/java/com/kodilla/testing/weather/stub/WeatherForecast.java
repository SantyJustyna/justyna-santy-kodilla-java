package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map <String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage(){

        double sum = 0;
        double average = 0;

        for(Map.Entry<String, Double> element :temperatures.getTemperatures().entrySet()){
            sum += element.getValue();
            average = sum / temperatures.getTemperatures().size();
        }
        return average;
    }

    public double calculateMedian(){

        double median = 0;
        List<Double> values = new ArrayList<>();
        for(Map.Entry<String, Double> element : temperatures.getTemperatures().entrySet()){
            values.add(element.getValue());
        }

        Collections.sort(values);

        if(values.size() % 2 != 0){
            median += values.get(values.size()/2);
        }else{
            median += (values.get((values.size()/2)-1) + values.get(values.size()/2)) / 2;
        }

        return median;
    }
}
