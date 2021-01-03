package com.hfdp.abstractFactory.ingredients;

public enum Pepperoni {
    SLICED("Sliced"),
    ;

    private final String name;

    Pepperoni(String name) {
        this.name = name;
    }

    public String getName() {
        return name + " Pepperoni";
    }
}
