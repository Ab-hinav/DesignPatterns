package org.Designs.Observer.Subjects;

import java.util.Observable;

public class WeatherDataUsingJava extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataUsingJava() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
