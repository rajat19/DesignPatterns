package com.hfdp.creational.factory.pizzas.chicago;

import com.hfdp.creational.factory.ingredients.Dough;
import com.hfdp.creational.factory.pizzas.Pizza;

public class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza() {
        this.name = "Chicago Style Pizza";
        this.dough = Dough.EXTRA_THICK;
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Parmesan Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
