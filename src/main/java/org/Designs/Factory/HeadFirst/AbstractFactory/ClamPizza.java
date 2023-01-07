package org.Designs.Factory.HeadFirst.AbstractFactory;


public class ClamPizza extends pizza {
    IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
