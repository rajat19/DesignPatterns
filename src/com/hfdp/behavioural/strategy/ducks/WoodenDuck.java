package com.hfdp.behavioural.strategy.ducks;

import com.hfdp.behavioural.strategy.behaviours.FlyNoWay;
import com.hfdp.behavioural.strategy.behaviours.NoQuackSound;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new NoQuackSound();
    }
}
