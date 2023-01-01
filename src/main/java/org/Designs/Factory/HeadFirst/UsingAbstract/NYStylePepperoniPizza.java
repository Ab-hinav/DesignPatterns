package org.Designs.Factory.HeadFirst.UsingAbstract;

public class NYStylePepperoniPizza extends AbstractPizza {

        public NYStylePepperoniPizza() {
            name = "NY Style Sauce and Pepperoni Pizza";
            dough = "Thin Crust Dough";
            sauce = "Marinara Sauce";
            toppings.add("Grated Reggiano Cheese");
            toppings.add("Sliced Pepperoni");
            toppings.add("Garlic");
            toppings.add("Onion");
            toppings.add("Mushrooms");
            toppings.add("Red Pepper");
        }
}
