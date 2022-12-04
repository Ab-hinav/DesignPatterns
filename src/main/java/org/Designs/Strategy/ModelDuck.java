package org.Designs.Strategy;

import org.Designs.Strategy.FlyBehaviours.FlyNoWay;
import org.Designs.Strategy.QuackBehaviours.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }

}
