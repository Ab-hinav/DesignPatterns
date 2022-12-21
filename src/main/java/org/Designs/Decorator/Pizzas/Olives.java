package org.Designs.Decorator.Pizzas;

public class Olives extends Toppings {

    private BasePizza basePizza;

    public Olives(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer getCost() {
        return basePizza.getCost() + 5;
    }
}
