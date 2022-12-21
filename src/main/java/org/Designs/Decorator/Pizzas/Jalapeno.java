package org.Designs.Decorator.Pizzas;

public class Jalapeno extends Toppings {

    private BasePizza basePizza;

    public Jalapeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer getCost() {
        return basePizza.getCost() + 5;
    }
}
