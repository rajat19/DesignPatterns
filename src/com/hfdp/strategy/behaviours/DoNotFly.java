package com.hfdp.strategy.behaviours;

import com.hfdp.strategy.FlyBehaviour;

public class DoNotFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot fly as do not have wings");
    }
}
