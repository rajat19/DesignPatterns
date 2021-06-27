package com.hfdp.structural.facade.subsystems;

public class PopcornPopper {
    public void on() {
        System.out.println(this + " on");
    }
    public void off() {
        System.out.println(this + " off");
    }
    public void pop() {
        System.out.println(this + " popping popcorn!");
    }

    public String toString() {
        return "Popcorn Popper";
    }
}
