package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParserDataTest {
    @Test
    public void isMatchTrueWhenListContainsIt() {
        ParserData parserData = new ParserData();
        assertTrue(parserData.revise("l", "true").contains("true"));
    }
}
