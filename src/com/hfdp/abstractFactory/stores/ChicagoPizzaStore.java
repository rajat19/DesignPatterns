package com.hfdp.abstractFactory.stores;

import com.hfdp.abstractFactory.PizzaCuttingStyle;
import com.hfdp.abstractFactory.PizzaType;
import com.hfdp.abstractFactory.ingredientFactories.ChicagoPizzaIngredientFactory;
import com.hfdp.abstractFactory.ingredientFactories.PizzaIngredientFactory;
import com.hfdp.abstractFactory.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }
        pizza.setCuttingStyle(PizzaCuttingStyle.SQUARE);
        return pizza;
    }
}
