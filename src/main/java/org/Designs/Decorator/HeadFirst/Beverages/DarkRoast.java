package org.Designs.Decorator.HeadFirst.Beverages;

import org.Designs.Decorator.HeadFirst.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }

}
