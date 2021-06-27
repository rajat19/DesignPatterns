package com.hfdp.creational.factory.stores;

import com.hfdp.creational.factory.PizzaType;
import com.hfdp.creational.factory.pizzas.Pizza;

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
