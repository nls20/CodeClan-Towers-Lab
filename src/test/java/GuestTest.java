import Packages.Guest;
import Packages.Room;
import Packages.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before () {
        guest = new Guest ("Jenny");
    }

    @Test
    public void getName() {
        assertEquals("Jenny", guest.getGuestName());
    }

}
