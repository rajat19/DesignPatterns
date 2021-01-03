package com.hfdp.decorator.condiments;

import com.hfdp.decorator.Beverage;
import com.hfdp.decorator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}