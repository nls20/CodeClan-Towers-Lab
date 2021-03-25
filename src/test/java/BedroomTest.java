import Packages.RoomType;
import Rooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 1, 2);
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomCapacity() {
        assertEquals(2, bedroom.getRoomCapacity());
    }

}
