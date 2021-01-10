package com.hfdp.facade.subsystems;

public class Projector {
    private DvdPlayer dvdPlayer;
    private String brand;

    public Projector(DvdPlayer dvdPlayer, String brand) {
        this.dvdPlayer = dvdPlayer;
        this.brand = brand;
    }

    public void on() {
        System.out.println(this + " on");
    }
    public void off() {
        System.out.println(this + " off");
    }
    public void tvMode() {
        System.out.println(this + " in tv mode");
    }
    public void wideScreenMode() {
        System.out.println(this + " in widescreen mode (16:9)");
    }
    public String toString() {
        return brand + " Projector";
    }
}
