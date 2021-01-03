package com.hfdp.factory.stores;

import com.hfdp.factory.PizzaType;
import com.hfdp.factory.pizzas.Pizza;

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
