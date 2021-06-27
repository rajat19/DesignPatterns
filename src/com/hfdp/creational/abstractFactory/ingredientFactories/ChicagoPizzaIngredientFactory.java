package com.hfdp.creational.abstractFactory.ingredientFactories;

import com.hfdp.creational.abstractFactory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return Dough.THICK;
    }

    @Override
    public Sauce createSauce() {
        return Sauce.PLUM_TOMATO;
    }

    @Override
    public Cheese createCheese() {
        return Cheese.MOZZARELLA;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{Veggies.EGG_PLANT, Veggies.SPINACH, Veggies.BLACK_OLIVE};
    }

    @Override
    public Pepperoni createPepperoni() {
        return Pepperoni.SLICED;
    }

    @Override
    public Clams createClams() {
        return Clams.FROZEN;
    }
}
