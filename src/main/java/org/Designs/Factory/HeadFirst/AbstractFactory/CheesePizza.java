package org.Designs.Factory.HeadFirst.AbstractFactory;

public class CheesePizza extends pizza{

    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

    }
}
