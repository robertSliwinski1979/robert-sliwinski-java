
package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private static int testCounter = 0;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Test nr# " + testCounter + "  begins");
    }

    @AfterEach
    public void after() {
        System.out.println("Test nr# " + testCounter + "  ended");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite WeatherForecast: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite WeatherForecast: end");
    }

    @Test
    void testCalculateForecastWithMock() {

        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Resow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warsaw", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int qualityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, qualityOfSensors);
    }

    @Test
    void testCalculateAverageWithMock() {

        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Resow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warsaw", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);//[1b]

        //When
        double average = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(25.56, average);
    }

    @Test
    void testCalculateMedian() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Resow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warsaw", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.calculateMedian();

        //Then
        Assertions.assertEquals(25.5, median);
    }
}


