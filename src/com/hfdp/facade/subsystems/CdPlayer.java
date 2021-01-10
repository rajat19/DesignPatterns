package com.hfdp.facade.subsystems;

public class CdPlayer {
    private String brand;

    public CdPlayer(String brand) {
        this.brand = brand;
    }

    public void on() {
        System.out.println(this + " on");
    }
    public void off() {
        System.out.println(this + " off");
    }
    public void eject() {
        System.out.println(this + " eject");
    }
    public void pause() {
        System.out.println(this + " pause");
    }
    public void play(String movie) {
        System.out.println(this + " playing \"" + movie + "\"");
    }
    public void stop() {
        System.out.println(this + " stop");
    }

    public String toString() {
        return brand + " CD Player";
    }
}
