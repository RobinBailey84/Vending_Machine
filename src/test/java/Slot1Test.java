import Slots.Slot1;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Slot1Test {

    Slot1 slot1;

    @Before
    public void setup(){
        slot1 = new Slots.Slot1("S1");
    }

    @Test
    public void hasName() {
        assertEquals("S1", slot1.getSlotNumber());
    }

    @Test
    public void hasEmptyArray() {
        assertEquals(0, slot1.getProductsSize());
    }
}
