package com.hfdp.abstractFactory.ingredientFactories;

import com.hfdp.abstractFactory.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return Dough.THIN;
    }

    @Override
    public Sauce createSauce() {
        return Sauce.MARINARA;
    }

    @Override
    public Cheese createCheese() {
        return Cheese.REGGIANO;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{Veggies.GARLIC, Veggies.MUSHROOM, Veggies.ONION, Veggies.RED_PEPPER};
    }

    @Override
    public Pepperoni createPepperoni() {
        return Pepperoni.SLICED;
    }

    @Override
    public Clams createClams() {
        return Clams.FRESH;
    }
}
