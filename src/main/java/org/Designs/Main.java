package org.Designs;

import org.Designs.Observer.Observers.CurrentConditionsDisplay;
import org.Designs.Observer.Observers.ForcastDisplay;
import org.Designs.Observer.Observers.StatisticsDisplay;
import org.Designs.Observer.Subjects.WeatherData;
import org.Designs.Strategy.FlyBehaviours.FlyRocketPowered;
import org.Designs.Strategy.MallardDuck;
import org.Designs.Strategy.ModelDuck;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Strategy Pattern");
//        MallardDuck mallardDuck = new MallardDuck();
//        mallardDuck.performQuack();
//        mallardDuck.performFly();
//
//        ModelDuck modelDuck = new ModelDuck();
//        modelDuck.performFly();
//        modelDuck.setFlyBehavior(new FlyRocketPowered());
//        modelDuck.performFly();

        System.out.println("Observer Pattern");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);




    }
}