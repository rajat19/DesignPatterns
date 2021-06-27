package com.hfdp.creational.abstractFactory.pizzas;

import com.hfdp.creational.abstractFactory.ingredientFactories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
