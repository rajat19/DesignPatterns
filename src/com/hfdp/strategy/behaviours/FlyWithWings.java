package com.hfdp.strategy.behaviours;

import com.hfdp.strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can fly as have wings");
    }
}
