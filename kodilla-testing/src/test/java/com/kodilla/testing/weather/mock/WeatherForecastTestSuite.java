package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.TemperaturesStub;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Weather Forecast Test Suite")
@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    private HashMap temperaturesMap;

    @BeforeEach
    public void setUp(){
        this.temperaturesMap = new HashMap<String, Double>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Siute: begin");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("All test ended");
    }

    @Test
    void testCalculateForecastWithMock(){
        //Given
        this.temperaturesMap = temperaturesMap;

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverage(){

        //Given
        this.temperaturesMap = temperaturesMap;

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(25.56, result);
    }
    @Test
    void testCalculateMedian() {
        //Given
        this.temperaturesMap = temperaturesMap;

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianExpected = weatherForecast.calculateMedian();

        //Then
        Assertions.assertEquals(25.5, medianExpected);
    }
}
