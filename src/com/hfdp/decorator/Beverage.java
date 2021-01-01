package com.hfdp.decorator;

public abstract class Beverage {
    protected String description;

    public Beverage() {
        this.description = "Unknown beverage";
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
