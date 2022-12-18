package org.Designs.Decorator.HeadFirst.Beverages;

import org.Designs.Decorator.HeadFirst.Beverage;

public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
