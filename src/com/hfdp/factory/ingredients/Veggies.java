package com.hfdp.factory.ingredients;

public enum Veggies {
    GARLIC("Garlic"),
    ONION("Onion"),
    MUSHROOM("Mushroom"),
    RED_PEPPER("Red Pepper"),
    EGG_PLANT("Egg Plant"),
    SPINACH("Spinach"),
    BLACK_OLIVE("Black Olive")
    ;

    private final String name;

    Veggies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
