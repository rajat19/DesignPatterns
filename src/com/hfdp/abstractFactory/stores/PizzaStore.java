package com.hfdp.abstractFactory.stores;

import com.hfdp.abstractFactory.PizzaType;
import com.hfdp.abstractFactory.pizzas.Pizza;

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
