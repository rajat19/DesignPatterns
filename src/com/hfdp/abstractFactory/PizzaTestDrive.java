package com.hfdp.abstractFactory;

import com.hfdp.abstractFactory.pizzas.Pizza;
import com.hfdp.abstractFactory.stores.ChicagoPizzaStore;
import com.hfdp.abstractFactory.stores.NYPizzaStore;
import com.hfdp.abstractFactory.stores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered " + nyPizza);

        Pizza chicagoPizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered " + chicagoPizza);
    }
}
