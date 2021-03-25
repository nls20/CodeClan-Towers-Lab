package Rooms;

import Packages.Room;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(String name, int capacity) {
        super(capacity);
        this.name = name;
    }

    public String getRoomName() {
        return this.name;
    }

    public int getRoomCapacity() {
        return this.capacity;
    }
}
