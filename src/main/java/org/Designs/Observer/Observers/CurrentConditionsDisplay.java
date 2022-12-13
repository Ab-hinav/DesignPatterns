package org.Designs.Observer.Observers;

import org.Designs.Observer.Display;
import org.Designs.Observer.Observer;
import org.Designs.Observer.Subject;

public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
