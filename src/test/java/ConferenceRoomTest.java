import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before () {
        conferenceRoom = new ConferenceRoom("Business Suite", 10);
    }

    @Test
    public void canGetRoomName() {
        assertEquals("Business Suite", conferenceRoom.getRoomName());
    }

    @Test
    public void canGetRoomCapacity() {
        assertEquals(10, conferenceRoom.getRoomCapacity());
    }
}
