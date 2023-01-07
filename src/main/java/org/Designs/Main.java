package org.Designs;

import org.Designs.Decorator.HeadFirst.Beverage;
import org.Designs.Decorator.HeadFirst.Beverages.DarkRoast;
import org.Designs.Decorator.HeadFirst.Beverages.Expresso;
import org.Designs.Decorator.HeadFirst.Beverages.HouseBlend;
import org.Designs.Decorator.HeadFirst.Condiments.Milk;
import org.Designs.Decorator.HeadFirst.Condiments.Mocha;
import org.Designs.Decorator.HeadFirst.Condiments.Whip;
import org.Designs.Decorator.HeadFirst.LowerCaseInputStream;
import org.Designs.Decorator.Pizzas.BasePizza;
import org.Designs.Decorator.Pizzas.Jalapeno;
import org.Designs.Decorator.Pizzas.Margaritta;
import org.Designs.Decorator.Pizzas.Olives;
import org.Designs.Factory.HeadFirst.UsingAbstract.AbstractPizza;
import org.Designs.Factory.HeadFirst.UsingAbstract.AbstractPizzaStore;
import org.Designs.Factory.HeadFirst.UsingAbstract.ChicagoPizzaStore;
import org.Designs.Factory.HeadFirst.UsingAbstract.NYStyleStore;
import org.Designs.Observer.Observers.CurrentConditionsDisplay;
import org.Designs.Observer.Observers.ForcastDisplay;
import org.Designs.Observer.Observers.StatisticsDisplay;
import org.Designs.Observer.Subjects.WeatherData;
import org.Designs.Strategy.FlyBehaviours.FlyRocketPowered;
import org.Designs.Strategy.MallardDuck;
import org.Designs.Strategy.ModelDuck;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Strategy Pattern");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        */

        /*
        System.out.println("Observer Pattern");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
        */

        /*
        System.out.println("Decorator Pattern");
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Whip(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(System.in));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        BasePizza pizza = new Margaritta();
        pizza = new Jalapeno(new Olives(pizza));
        System.out.println(pizza.getCost());
        */

        System.out.println("Factory Pattern");
        AbstractPizzaStore pizzaStore = new NYStyleStore();
        AbstractPizzaStore pizzaStore2 = new ChicagoPizzaStore();

        AbstractPizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() );

        pizza = pizzaStore2.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() );


    }
}