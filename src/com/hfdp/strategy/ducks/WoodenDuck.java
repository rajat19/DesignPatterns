package com.hfdp.strategy.ducks;

import com.hfdp.strategy.Duck;
import com.hfdp.strategy.behaviours.FlyNoWay;
import com.hfdp.strategy.behaviours.NoQuackSound;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new NoQuackSound();
    }
}
