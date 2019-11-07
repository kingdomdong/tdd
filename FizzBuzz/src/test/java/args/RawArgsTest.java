package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RawArgsTest {
    @Test
    public void isMatchTrueWhenArgsContainsIt() {
        assertEquals("true", new RawArgs(new String[]{"-l", "   true", "p"}).getValue("l"));
    }
}
