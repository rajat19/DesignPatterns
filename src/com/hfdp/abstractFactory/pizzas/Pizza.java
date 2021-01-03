package com.hfdp.abstractFactory.pizzas;

import com.hfdp.abstractFactory.ingredients.*;

import java.util.Arrays;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 deg.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", with ").append(dough.getName()).append(", ").append(sauce.getName())
                .append(", ").append(cheese.getName());
        if (veggies != null && veggies.length > 0) {
            sb.append("\nVeggies: ");
            for (Veggies veggie: veggies) {
                sb.append(veggie.getName()).append("\n");
            }
        }
        if (clams != null) {
            sb.append("\n").append(clams.getName());
        }
        if (pepperoni != null) {
            sb.append("\n").append(pepperoni.getName());
        }

        return sb.toString();
    }
}
