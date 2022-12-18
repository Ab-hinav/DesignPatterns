package org.Designs.Decorator.HeadFirst.Condiments;

import org.Designs.Decorator.HeadFirst.Beverage;
import org.Designs.Decorator.HeadFirst.Decorators;

public class Milk extends Decorators {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }

}
