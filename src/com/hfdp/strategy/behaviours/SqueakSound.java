package com.hfdp.strategy.behaviours;

import com.hfdp.strategy.QuackBehaviour;

public class SqueakSound implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Produces Squeak Sound");
    }
}
