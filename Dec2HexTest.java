import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Dec2HexTest {

    @Test
    public void testConvertDecToHex() {
        assertEquals("0", Dec2Hex.convertDecToHex(0));
        assertEquals("A", Dec2Hex.convertDecToHex(10));
    }
}
