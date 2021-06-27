package com.hfdp.creational.factory.pizzas.newyork;

import com.hfdp.creational.factory.ingredients.Dough;
import com.hfdp.creational.factory.pizzas.Pizza;

public class NYStylePizza extends Pizza {
    public NYStylePizza() {
        this.name = "NY Style Sauce Pizza";
        this.dough = Dough.THIN;
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Reggiano Cheese");
    }
}
