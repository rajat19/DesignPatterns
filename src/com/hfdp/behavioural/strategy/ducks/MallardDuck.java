package com.hfdp.behavioural.strategy.ducks;

import com.hfdp.behavioural.strategy.behaviours.FlyWithWings;
import com.hfdp.behavioural.strategy.behaviours.QuackSound;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new QuackSound();
    }
}
