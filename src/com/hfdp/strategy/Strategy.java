package com.hfdp.strategy;

import com.hfdp.strategy.ducks.MallardDuck;
import com.hfdp.strategy.ducks.RubberDuck;
import com.hfdp.strategy.ducks.WoodenDuck;

public class Strategy {
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
