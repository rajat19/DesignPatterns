package com.hfdp.abstractFactory;

public enum PizzaType {
    CHEESE("cheese"),
    VEGGIE("veggie"),
    CLAM("clam"),
    PEPPERONI("pepperoni"),
    ;

    private String description;

    PizzaType(String description) {
        this.description = description;
    }
}
