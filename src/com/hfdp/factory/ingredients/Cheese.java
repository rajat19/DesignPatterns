package com.hfdp.factory.ingredients;

public enum Cheese {
    REGGIANO("Reggiano"),
    MOZZARELLA("Grated Mozzarella"),
    GOAT("Goat")
    ;

    private final String name;

    Cheese(String name) {
        this.name = name;
    }

    public String getName() {
        return name + " Cheese";
    }
}
