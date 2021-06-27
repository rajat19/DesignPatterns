package com.hfdp.creational.factory;

import com.hfdp.creational.factory.pizzas.Pizza;
import com.hfdp.creational.factory.stores.ChicagoPizzaStore;
import com.hfdp.creational.factory.stores.NYPizzaStore;
import com.hfdp.creational.factory.stores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered " + nyPizza.getName());

        Pizza chicagoPizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered " + chicagoPizza.getName());
    }
}
