package org.Designs;

import org.Designs.Adapter.HeadFirst.Duck;
import org.Designs.Adapter.HeadFirst.MallardDuck;
import org.Designs.Adapter.HeadFirst.TurkeyAdapter;
import org.Designs.Adapter.HeadFirst.WildTurkey;
import org.Designs.Command.headFirst.*;
import org.Designs.Composite.Menu;
import org.Designs.Composite.MenuComponent;
import org.Designs.Composite.MenuItem;
import org.Designs.Composite.Waitress;
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
import org.Designs.Iterator.CafeMenu;
import org.Designs.Iterator.DinerMenu;
import org.Designs.Iterator.PancakeHouseMenu;
//import org.Designs.Iterator.Waitress;
import org.Designs.NullObject.Vehicle;
import org.Designs.NullObject.VehicleFactory;
import org.Designs.Observer.Observers.CurrentConditionsDisplay;
import org.Designs.Observer.Observers.ForcastDisplay;
import org.Designs.Observer.Observers.StatisticsDisplay;
import org.Designs.Observer.Subjects.WeatherData;
import org.Designs.Singleton.SingletonBasic;
import org.Designs.Strategy.FlyBehaviours.FlyRocketPowered;
//import org.Designs.Strategy.MallardDuck;
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

        /*
        System.out.println("Factory Pattern");
        AbstractPizzaStore pizzaStore = new NYStyleStore();
        AbstractPizzaStore pizzaStore2 = new ChicagoPizzaStore();

        AbstractPizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() );

        pizza = pizzaStore2.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() );
        */

        /*
        System.out.println("Singleton Pattern");
        SingletonBasic singleton = SingletonBasic.getInstance("the first instance");
        System.out.println(singleton.getMessage());
        SingletonBasic singleton2 = SingletonBasic.getInstance("the second instance");
        System.out.println(singleton2.getMessage());
        */

        /*
        System.out.println("Command Pattern");
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
        */


//        System.out.println(" Command Pattern -- continue");
//        RealRemoteControl remoteControl = new RealRemoteControl();
//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//        GarageDoor garageDoor = new GarageDoor();
//        Stereo stereo = new Stereo();
//
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//
//        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
//        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//
//        remoteControl.setCommands(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommands(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommands(2, garageDoorOpen, garageDoorClose);
//        remoteControl.setCommands(3, stereoOnWithCD, stereoOff);
//
//        System.out.println(remoteControl);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);

        /*
        System.out.println("Command Pattern -- continue");
        RealRemoteControl remoteControl = new RealRemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        remoteControl.setCommands(0,()->livingRoomLight.on(),()->livingRoomLight.off());
        remoteControl.setCommands(1,kitchenLight::on,kitchenLight::off);
        remoteControl.setCommands(2,()->garageDoor.up(),()->garageDoor.down());
        Command stereoOnWithCD = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        };
        remoteControl.setCommands(3,stereoOnWithCD,()->stereo.off());
        */

        /*
        System.out.println("Adapter Pattern");
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        */

        /*
        System.out.println("Iterator Pattern");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
        */

        /*
        System.out.println("Composite Pattern");
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99));
        dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));

        dinerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        */

        System.out.println("Null Object Pattern");
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("Car");
        Vehicle bike = vehicleFactory.getVehicle("Bike");

        System.out.println(car.getVehicleName());
        System.out.println(bike.getVehicleName());
        // using null object pattern we can avoid null pointer exception , and no need to check for null




    }
}