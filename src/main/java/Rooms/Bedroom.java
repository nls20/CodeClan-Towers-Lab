package Rooms;

import Packages.Room;
import Packages.RoomType;
import Packages.Guest;

public class Bedroom extends Room {

    public RoomType roomType;
    private int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber, int capacity) {
        super(capacity);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getRoomCapacity() {
        return this.capacity;
    }

}

//    public int addGuestToRoom(Guest guest) {
//        this.guestList.add(Guest);
//    }
//}
