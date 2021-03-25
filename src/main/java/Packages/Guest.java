package Packages;

import Rooms.Bedroom;

public class Guest {

    private Guest guest;
    private String name;


    public Guest(String name) {
        this.name = name;
    }

    public String getGuestName() {
        return this.name;
    }
}
