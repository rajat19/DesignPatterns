package com.hfdp.behavioural.template;

import com.hfdp.behavioural.template.beverages.Coffee;
import com.hfdp.behavioural.template.beverages.Tea;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
