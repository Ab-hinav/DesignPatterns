package org.Designs.Decorator.HeadFirst.Condiments;

import org.Designs.Decorator.HeadFirst.Beverage;
import org.Designs.Decorator.HeadFirst.Decorators;

public class Mocha extends Decorators {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
