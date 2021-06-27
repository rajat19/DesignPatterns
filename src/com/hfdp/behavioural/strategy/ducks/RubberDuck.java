package com.hfdp.behavioural.strategy.ducks;

import com.hfdp.behavioural.strategy.behaviours.FlyNoWay;
import com.hfdp.behavioural.strategy.behaviours.SqueakSound;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new SqueakSound();
    }
}
