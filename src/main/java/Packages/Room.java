package Packages;

import java.util.ArrayList;

public abstract class Room {

    public int capacity;
    public ArrayList<Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public int checkRoomQuantity() {
        return this.guestList.size();
    }

    public void addGuestToRoom(Guest guest) {
        this.guestList.add(guest);
    }

}
