package com.hfdp.creational.abstractFactory.ingredients;

public enum Sauce {
    MARINARA("Marinara"),
    PLUM_TOMATO("Plum Tomato"),
    BRUSCHETTA("Bruschetta"),
    ;

    private final String name;

    Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name + " Sauce";
    }
}
