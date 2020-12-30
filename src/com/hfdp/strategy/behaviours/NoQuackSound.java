package com.hfdp.strategy.behaviours;

import com.hfdp.strategy.QuackBehaviour;

public class NoQuackSound implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No Quack Sound Produced");
    }
}
