package com.hfdp.strategy;

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
