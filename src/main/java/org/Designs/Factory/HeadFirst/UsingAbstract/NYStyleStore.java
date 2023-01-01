package org.Designs.Factory.HeadFirst.UsingAbstract;

public class NYStyleStore extends AbstractPizzaStore {

    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
