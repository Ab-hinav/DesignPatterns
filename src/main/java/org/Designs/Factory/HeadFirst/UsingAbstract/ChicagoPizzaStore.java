package org.Designs.Factory.HeadFirst.UsingAbstract;

public class ChicagoPizzaStore extends AbstractPizzaStore {

        @Override
        public AbstractPizza createPizza(String type) {
            AbstractPizza pizza = null;
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
            return pizza;
        }

}
