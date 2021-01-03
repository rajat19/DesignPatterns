package com.hfdp.abstractFactory.ingredients;

public enum Dough {
    THIN("Thin"),
    THICK("Thick"),
    EXTRA_THICK("Extra Thick"),
    EXTRA_THIN("Extra Thin"),
    ;

    private final String name;

    Dough(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name + " Crust Dough";
    }

    @Override
    public String toString() {
        return getName();
    }
}
