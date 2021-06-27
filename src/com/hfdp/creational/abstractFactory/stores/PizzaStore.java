package com.hfdp.creational.abstractFactory.stores;

import com.hfdp.creational.abstractFactory.PizzaType;
import com.hfdp.creational.abstractFactory.pizzas.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
