package com.hfdp.observer.display;

import com.hfdp.observer.DisplayElement;
import com.hfdp.observer.Observer;
import com.hfdp.observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current Conditions: %f F degrees and %f cent humidity\n", temperature, humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
