package org.Designs.Factory.HeadFirst;

import org.Designs.Factory.HeadFirst.SimpleFactory.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public void PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza ;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
