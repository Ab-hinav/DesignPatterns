package org.Designs;

import org.Designs.Strategy.FlyBehaviours.FlyRocketPowered;
import org.Designs.Strategy.MallardDuck;
import org.Designs.Strategy.ModelDuck;

public class Main {
    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();


        System.out.println("Hello world!");
    }
}