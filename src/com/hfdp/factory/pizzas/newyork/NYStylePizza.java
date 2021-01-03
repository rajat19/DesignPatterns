package com.hfdp.factory.pizzas.newyork;

import com.hfdp.factory.ingredients.Dough;
import com.hfdp.factory.pizzas.Pizza;

public class NYStylePizza extends Pizza {
    public NYStylePizza() {
        this.name = "NY Style Sauce Pizza";
        this.dough = Dough.THIN;
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Reggiano Cheese");
    }
}
