package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgTypesTest {

    @Test
    public void isMatchBoolWhenTypesContainsIt() {
        assertEquals("bool", new ArgTypes(new String[]{"l", " bool", "p"}).getType("l"));
    }

}
