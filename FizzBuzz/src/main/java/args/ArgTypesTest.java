package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArgTypesTest {
    @Test
    public void isMatchBoolWhenListContainsIt() {
        assertTrue(new ArgTypes("l", "bool").revise("l", "bool").contains("bool"));
        assertTrue(new ArgTypes("l", " bool").revise("l", " bool").contains("bool"));
    }

    @Test
    public void isMatchBoolWhenGetFlagL() {
        assertEquals("bool", new ArgTypes("l", " bool ").getType("l"));
    }

}
