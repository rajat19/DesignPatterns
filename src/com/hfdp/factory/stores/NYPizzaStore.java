package com.hfdp.factory.stores;

import com.hfdp.factory.PizzaType;
import com.hfdp.factory.pizzas.Pizza;
import com.hfdp.factory.pizzas.newyork.NYStyleCheesePizza;
import com.hfdp.factory.pizzas.newyork.NYStyleClamPizza;
import com.hfdp.factory.pizzas.newyork.NYStylePepperoniPizza;
import com.hfdp.factory.pizzas.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) return new NYStyleCheesePizza();
        if (type == PizzaType.VEGGIE) return new NYStyleVeggiePizza();
        if (type == PizzaType.CLAM) return new NYStyleClamPizza();
        if (type == PizzaType.PEPPERONI) return new NYStylePepperoniPizza();
        return null;
    }
}
