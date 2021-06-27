package com.hfdp.behavioural.strategy.behaviours;

public class SqueakSound implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Produces Squeak Sound");
    }
}
