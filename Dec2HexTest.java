import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Dec2HexTest {

    @Test
    public void testConvertDecToHex() {

        assertEquals("A", Dec2Hex.convertDecToHex(10));
    }
}
