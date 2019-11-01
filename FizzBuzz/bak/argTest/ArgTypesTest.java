package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgTypesTest {


    @Test
    public void isMatchStrWhenTypeIsB() {
        assertEquals("bool", new ArgTypes("l", " bool ").getType("l"));
        assertEquals("", new ArgTypes("l").getType("l"));
    }

    @Test
    public void isMatchTrueWhenArgsHasL() {
        assertEquals("true", new RawArgs(" -l", " true ").getValue("l"));
        assertEquals("", new RawArgs(" -b", " ").getValue("b"));
    }

}
