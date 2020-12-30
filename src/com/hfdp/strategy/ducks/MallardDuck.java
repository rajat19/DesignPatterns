package com.hfdp.strategy.ducks;

import com.hfdp.strategy.Duck;
import com.hfdp.strategy.behaviours.FlyWithWings;
import com.hfdp.strategy.behaviours.QuackSound;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new QuackSound();
    }
}
