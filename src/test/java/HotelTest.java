import Packages.Guest;
import Packages.Room;
import Packages.RoomType;
import Rooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Guest guest;
    Room room;

    @Before
    public void before() {
        hotel = new Hotel(6);
        bedroom = new Bedroom(RoomType.DOUBLE, 1, 2);
        guest = new Guest("Jenny");
    }

    @Test
    public void bedroomListStartsAtZero() {
        assertEquals(0, hotel.bedroomListSize());
    }

    @Test
    public void canAddBedroomToBedroomList() {
        hotel.addBedroomToBedroomList(bedroom);
        assertEquals(1, hotel.bedroomListSize());
    }

    @Test
    public void canAddGuestToBedroom() {
        hotel.addGuestToBedroom(guest, RoomType.DOUBLE);
        assertEquals(1, room.checkRoomQuantity());
    }
}
