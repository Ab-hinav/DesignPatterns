package org.Designs.Factory.HeadFirst;

public class Pizza {

    public void Pizza() {

    }

    public void prepare() {
        System.out.println("Preparing pizza");
    }

    public void bake() {
        System.out.println("Baking pizza");
    }

    public void cut() {
        System.out.println("Cutting pizza");
    }

    public void box() {
        System.out.println("Boxing pizza");
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
