package org.Designs.Observer.Observers;

import org.Designs.Observer.Display;
import org.Designs.Observer.Observer;
import org.Designs.Observer.Subjects.WeatherData;

public class StatisticsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = (WeatherData) weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        float avg = (temperature + humidity + pressure) / 3;
        System.out.println("Avg/temp/humidity temperature = " + avg + "/" + temperature + "/" + humidity);
    }

}
