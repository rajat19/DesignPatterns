package com.hfdp.structural.facade.subsystems;

public class Amplifier {
    private String brand;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public Amplifier(String brand) {
        this.brand = brand;
    }

    public void on() {
        System.out.println(this + " on");
    }

    public void off() {
        System.out.println(this + " off");
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println(this + " setting CD Player to " + cdPlayer);
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println(this + " setting DVD Player to " + dvdPlayer);
    }

    public void setStereoSound() {
        System.out.println(this + " stereo sound on");
    }

    public void setSurroundSound() {
        System.out.println(this + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println(this + " setting volume to " + volume);
    }

    public String toString() {
        return this.brand + " Amplifier";
    }
}
