package com.hfdp.command.vendors;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {

    }

    public void off() {

    }

    public void setCD() {

    }

    public void setDVD() {

    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
