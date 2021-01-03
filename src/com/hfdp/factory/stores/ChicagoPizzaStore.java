package com.hfdp.factory.stores;

import com.hfdp.factory.PizzaType;
import com.hfdp.factory.pizzas.Pizza;
import com.hfdp.factory.pizzas.chicago.ChicagoStyleCheesePizza;
import com.hfdp.factory.pizzas.chicago.ChicagoStyleClamPizza;
import com.hfdp.factory.pizzas.chicago.ChicagoStylePepperoniPizza;
import com.hfdp.factory.pizzas.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) return new ChicagoStyleCheesePizza();
        if (type == PizzaType.VEGGIE) return new ChicagoStyleVeggiePizza();
        if (type == PizzaType.CLAM) return new ChicagoStyleClamPizza();
        if (type == PizzaType.PEPPERONI) return new ChicagoStylePepperoniPizza();
        return null;
    }
}
