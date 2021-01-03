package com.hfdp.factory.pizzas.chicago;

import com.hfdp.factory.ingredients.Dough;
import com.hfdp.factory.pizzas.Pizza;

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
