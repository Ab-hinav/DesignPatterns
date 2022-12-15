package org.Designs.Observer.Observers;

import org.Designs.Observer.Display;
import org.Designs.Observer.Subjects.WeatherDataUsingJava;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayJava implements Observer, Display {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayJava(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if ( o instanceof WeatherDataUsingJava) {
            WeatherDataUsingJava weatherData = (WeatherDataUsingJava) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
