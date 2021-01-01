package com.hfdp.decorator.beverages;

import com.hfdp.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
