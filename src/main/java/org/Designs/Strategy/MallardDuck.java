package org.Designs.Strategy;

import org.Designs.Strategy.FlyBehaviours.FlyWithWings;
import org.Designs.Strategy.QuackBehaviours.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }



}
