package com.hfdp.behavioural.iterator;

import com.hfdp.behavioural.iterator.menus.CafeMenu;
import com.hfdp.behavioural.iterator.menus.DinerMenu;
import com.hfdp.behavioural.iterator.menus.PancakeHouseMenu;

import java.util.Arrays;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));
        waitress.printMenu();
    }
}
