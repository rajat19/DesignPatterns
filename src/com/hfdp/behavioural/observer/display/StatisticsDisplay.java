package com.hfdp.behavioural.observer.display;

import com.hfdp.behavioural.observer.DisplayElement;
import com.hfdp.behavioural.observer.Observer;
import com.hfdp.behavioural.observer.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %f/%f/%f\n",(tempSum / numReadings), maxTemp, minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;
        maxTemp = Math.max(maxTemp, temperature);
        minTemp = Math.min(minTemp, temperature);
        display();
    }
}
