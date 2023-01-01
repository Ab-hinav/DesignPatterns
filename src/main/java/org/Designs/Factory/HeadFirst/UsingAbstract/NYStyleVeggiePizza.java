package org.Designs.Factory.HeadFirst.UsingAbstract;

public class NYStyleVeggiePizza extends AbstractPizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
