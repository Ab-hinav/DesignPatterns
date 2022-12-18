package org.Designs.Decorator.HeadFirst.Condiments;

import org.Designs.Decorator.HeadFirst.Beverage;
import org.Designs.Decorator.HeadFirst.Decorators;

public class Whip extends Decorators {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }

}
