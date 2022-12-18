package org.Designs.Decorator.HeadFirst.Beverages;

import org.Designs.Decorator.HeadFirst.Beverage;

public class Expresso extends Beverage {

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
