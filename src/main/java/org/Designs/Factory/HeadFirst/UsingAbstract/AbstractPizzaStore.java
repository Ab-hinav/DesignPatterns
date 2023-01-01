package org.Designs.Factory.HeadFirst.UsingAbstract;



public abstract class AbstractPizzaStore {

    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract AbstractPizza createPizza(String type);

}
