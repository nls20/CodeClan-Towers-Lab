import Packages.Guest;
import Packages.Room;
import Packages.RoomType;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel extends Room {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    Bedroom bedroom;
    Guest guest;



    public Hotel(int capacity) {
        super(capacity);
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public int bedroomListSize() {
        return this.bedrooms.size();
    }

    public int conferenceRoomSize () {
        return this.conferenceRooms.size();
    }

    public void addBedroomToBedroomList (Bedroom bedroom) {
            this.bedrooms.add(bedroom);
    }

    public Bedroom findRoom(int roomNumber) {
        Bedroom found = null;
        for (Bedroom bedroom: this.bedrooms) {
            if (bedroom.getRoomNumber() == roomNumber) {
                found = bedroom;
            }
            return found;
    }

    public void addGuestToBedroom(ArrayList<Guest> guests, int roomNumber) {
        Bedroom bedroom = new Bedroom();
        for (Guest guest : guests) {
            bedroom.addGuestToRoom(guest);
        }
        for (Bedroom room: this.bedrooms) {
            if (room.getRoomType() == roomType) {
                room.addGuestToRoom(guest);
            }
        }
    }

}
