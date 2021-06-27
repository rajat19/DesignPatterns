package com.hfdp.behavioural.strategy.behaviours;

public class QuackSound implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Produces Quack Sound");
    }
}
