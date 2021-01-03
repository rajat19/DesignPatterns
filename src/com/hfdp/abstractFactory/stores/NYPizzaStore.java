package com.hfdp.abstractFactory.stores;

import com.hfdp.abstractFactory.PizzaCuttingStyle;
import com.hfdp.abstractFactory.PizzaType;
import com.hfdp.abstractFactory.ingredientFactories.NYPizzaIngredientFactory;
import com.hfdp.abstractFactory.ingredientFactories.PizzaIngredientFactory;
import com.hfdp.abstractFactory.pizzas.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }
        pizza.setCuttingStyle(PizzaCuttingStyle.DIAGONAL);
        return pizza;
    }
}
