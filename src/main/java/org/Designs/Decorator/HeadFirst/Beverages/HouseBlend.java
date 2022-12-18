package org.Designs.Decorator.HeadFirst.Beverages;

import org.Designs.Decorator.HeadFirst.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
