package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgTypesTest {


    @Test
    public void isMatchBoolWhenListContainsBool() {
        assertEquals("bool", new ArgTypes("l", " bool").getType("l"));
        assertEquals("", new ArgTypes().getType("l"));
    }

}
