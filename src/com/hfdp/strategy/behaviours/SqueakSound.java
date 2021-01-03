package com.hfdp.strategy.behaviours;

public class SqueakSound implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Produces Squeak Sound");
    }
}
