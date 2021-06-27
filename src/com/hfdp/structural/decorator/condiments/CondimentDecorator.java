package com.hfdp.structural.decorator.condiments;

import com.hfdp.structural.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
