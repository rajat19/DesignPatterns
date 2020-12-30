package com.hfdp.strategy.behaviours;

import com.hfdp.strategy.QuackBehaviour;

public class QuackSound implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Produces Quack Sound");
    }
}
