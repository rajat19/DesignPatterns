package com.hfdp.creational.factory.pizzas.chicago;

public class ChicagoStyleVeggiePizza extends ChicagoStylePizza {
    public ChicagoStyleVeggiePizza() {
        this.name = "Chicago Style Veggie Pizza";
        this.toppings.add("Eggplant");
        this.toppings.add("Spinach");
        this.toppings.add("Black Olives");
    }
}
