package com.hfdp.creational.factory.pizzas.chicago;

public class ChicagoStylePepperoniPizza extends ChicagoStylePizza {
    public ChicagoStylePepperoniPizza() {
        this.name = "Chicago Style Deep Dish Pepperoni Pizza";
        this.toppings.add("Eggplant");
        this.toppings.add("Spinach");
        this.toppings.add("Black Olives");
        this.toppings.add("Pepperoni");
    }
}
