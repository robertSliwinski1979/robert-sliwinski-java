package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub(){

        //Given
        Temperatures temperatures = new TemperaturesStub();//   [1]
        WeatherForecast weatherforecast = new WeatherForecast (temperatures);// [2]

        //When
        int qualityOfSensors = weatherforecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, qualityOfSensors);
    }
}
