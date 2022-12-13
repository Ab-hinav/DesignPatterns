package org.Designs.Observer.Observers;

import org.Designs.Observer.Display;
import org.Designs.Observer.Observer;
import org.Designs.Observer.Subjects.WeatherData;

public class ForcastDisplay implements Display, Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForcastDisplay(WeatherData weatherData) {
        this.weatherData = (WeatherData) weatherData;
        weatherData.registerObserver(this);
    }




    @Override
    public void display() {
        System.out.println("ForcastDisplay: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
