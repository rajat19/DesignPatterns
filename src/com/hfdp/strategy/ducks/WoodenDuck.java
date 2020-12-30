package com.hfdp.strategy.ducks;

import com.hfdp.strategy.Duck;
import com.hfdp.strategy.behaviours.DoNotFly;
import com.hfdp.strategy.behaviours.NoQuackSound;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        this.flyBehaviour = new DoNotFly();
        this.quackBehaviour = new NoQuackSound();
    }
}
