package com.hfdp.behavioural.strategy.behaviours;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot fly as do not have wings");
    }
}
