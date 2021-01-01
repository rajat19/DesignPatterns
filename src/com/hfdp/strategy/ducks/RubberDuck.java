package com.hfdp.strategy.ducks;

import com.hfdp.strategy.Duck;
import com.hfdp.strategy.behaviours.FlyNoWay;
import com.hfdp.strategy.behaviours.SqueakSound;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new SqueakSound();
    }
}
