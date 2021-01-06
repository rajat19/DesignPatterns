package com.hfdp.command.vendors;

public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    private void print(String action) {
        System.out.println(location + " Garage Door is " + action);
    }

    public void up() {
        print("UP!");
    }

    public void down() {
        print("DOWN!");
    }

    public void stop() {
        print("STOPPED!");
    }

    public void lightOn() {
        System.out.println("Garage Door Light is ON!");
    }

    public void lightOff() {
        System.out.println("Garage Door Light is OFF!");
    }
}
