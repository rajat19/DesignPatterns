package com.hfdp.strategy.ducks;

import com.hfdp.strategy.behaviours.FlyBehaviour;
import com.hfdp.strategy.behaviours.QuackBehaviour;

public class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public void swim() {
        System.out.println("Can swim");
    }

    public void display() {
        swim();
        flyBehaviour.fly();
        quackBehaviour.quack();
    }
}
