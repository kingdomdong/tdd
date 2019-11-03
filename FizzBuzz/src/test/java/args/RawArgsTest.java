package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RawArgsTest {
    @Test
    public void isMatchTrueWhenListContainsIt() {
        assertTrue(new RawArgs("-l", "true").revise("-l", "false").contains("false"));
        assertTrue(new RawArgs("-l", "true").revise("-l", " false").contains("false"));
    }

    @Test
    public void isMatchTrueWhenListGetFlagL() {
        assertEquals("false", new RawArgs("-l", "false").getValue("l"));
        assertEquals("false", new RawArgs("-l", "false ").getValue("l"));
    }
}
