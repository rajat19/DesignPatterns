package com.hfdp.template.beverages;

import java.io.IOException;
import java.util.Scanner;

public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
