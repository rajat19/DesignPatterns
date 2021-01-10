package com.hfdp.facade;

import com.hfdp.facade.subsystems.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        String brand = "Top-O-Line";
        String movie = "Raiders of the Lost Ark";
        Amplifier amplifier = new Amplifier(brand);
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer(brand);
        CdPlayer cdPlayer = new CdPlayer(brand);
        Projector projector = new Projector(dvdPlayer, brand);
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, lights, screen, popper);
        homeTheatre.watchMovie(movie);
        homeTheatre.endMovie();
    }
}
