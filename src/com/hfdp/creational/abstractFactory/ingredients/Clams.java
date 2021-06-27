package com.hfdp.creational.abstractFactory.ingredients;

public enum Clams {
    FRESH("Fresh Clams"),
    FROZEN("Frozen Clams"),
    CALAMARI("Calamari"),
    ;

    private final String name;

    Clams(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
