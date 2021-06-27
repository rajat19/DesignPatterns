package com.hfdp.structural.facade.subsystems;

public class Screen {
    public void up() {
        System.out.println(this + " going up");
    }
    public void down() {
        System.out.println(this + " going down");
    }

    public String toString() {
        return "Theater Screen";
    }
}
