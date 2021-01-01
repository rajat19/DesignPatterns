package com.hfdp.decorator.condiments;

import com.hfdp.decorator.Beverage;
import com.hfdp.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
