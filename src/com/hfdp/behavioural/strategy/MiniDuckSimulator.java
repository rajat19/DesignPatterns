package com.hfdp.behavioural.strategy;

import com.hfdp.behavioural.strategy.ducks.Duck;
import com.hfdp.behavioural.strategy.ducks.MallardDuck;
import com.hfdp.behavioural.strategy.ducks.RubberDuck;
import com.hfdp.behavioural.strategy.ducks.WoodenDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("-- Mallard duck --");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();

        System.out.println("-- Rubber duck --");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();

        System.out.println("-- Wooden duck --");
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.display();
    }
}
