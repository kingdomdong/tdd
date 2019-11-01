package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RawArgsTest {

    @Test
    public void isMatchTrueWhenArgsNormal() {
        assertEquals("true", new RawArgs("-l", "true", "p", "9090").getValue("l"));
        assertEquals("true", new RawArgs("-l", " true", "p", "9090").getValue("l"));
    }


}
