package com.hfdp.facade.subsystems;

public class DvdPlayer {
    private String brand;
    private String movie;

    public DvdPlayer(String brand) {
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
        this.movie = movie;
        System.out.println(this + " playing \"" + movie + "\"");
    }

    public void setSurroundAudio() {
        System.out.println(this + " set surround audio");
    }

    public void setTwoChannelAudio() {
        System.out.println(this + " set two channel audio");
    }

    public void stop() {
        System.out.println(this + " stopped \"" + movie + "\"");
    }

    public String toString() {
        return brand + " DVD Player";
    }
}
