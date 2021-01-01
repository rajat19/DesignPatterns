package com.hfdp.decorator.condiments;

import com.hfdp.decorator.Beverage;
import com.hfdp.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
