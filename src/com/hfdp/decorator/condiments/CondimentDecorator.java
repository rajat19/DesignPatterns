package com.hfdp.decorator.condiments;

import com.hfdp.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
