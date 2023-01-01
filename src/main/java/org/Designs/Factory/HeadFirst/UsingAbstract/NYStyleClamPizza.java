package org.Designs.Factory.HeadFirst.UsingAbstract;

public class NYStyleClamPizza extends AbstractPizza {
    public NYStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
