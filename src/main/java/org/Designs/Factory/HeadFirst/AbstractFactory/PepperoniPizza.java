package org.Designs.Factory.HeadFirst.AbstractFactory;

public class PepperoniPizza extends pizza{

    IngredientFactory ingredientFactory;

    public PepperoniPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
