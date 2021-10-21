package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public Double calculateMedian(){
        double result = 0;
        List<Double> a = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            a.add(temperature.getValue());
        }

        Collections.sort(a);

        if(a.size()%2 == 0){
            int b = a.size()/2;
            int c = (a.size()/2) -1;
            result = (a.get(b)+a.get(c))/2;
        }
            else {
                int d = a.size()/2;
                result= a.get(d);
            }
        return result;
    }
    public Double calculateAverage(){
        double result = 0;
        double total=0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            total += temperature.getValue() ;
        }
        result = total/(double) temperatures.getTemperatures().size();;
        return result;
    }

}
