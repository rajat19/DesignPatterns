package com.hfdp.abstractFactory;

public enum PizzaCuttingStyle {
    DIAGONAL("Cutting the pizza into diagonal slices"),
    SQUARE("Cutting the pizza into square slices"),
    ;

    private final String description;

    PizzaCuttingStyle(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
