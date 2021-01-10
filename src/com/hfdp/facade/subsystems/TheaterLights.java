package com.hfdp.facade.subsystems;

public class TheaterLights {
    private int brightness = 0;

    public void on() {
        System.out.println(this + " on");
    }
    public void off() {
        System.out.println(this + " off");
    }
    public void dim(int brightness) {
        this.brightness = brightness;
        System.out.println(this + " dimming to " + brightness + "%");
    }

    public int getBrightness() {
        return brightness;
    }

    @Override
    public String toString() {
        return "Theater Ceiling Lights";
    }
}
