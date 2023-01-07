package org.Designs.Factory.HeadFirst.AbstractFactory;

public class VeggiePizza extends pizza {

    IngredientFactory ingredientFactory;

    public VeggiePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
