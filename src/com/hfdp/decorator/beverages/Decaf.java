package com.hfdp.decorator.beverages;

import com.hfdp.decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaffeinated Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
