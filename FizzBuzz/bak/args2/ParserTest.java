package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParserTest {

    @Test
    public void isMatchTrueWhenFlagLIsTrue() {
        assertEquals(true, new Parser(new ArgTypes("l", "bool"), new RawArgs("-l", "true")).get("l"));
        assertEquals(true, new Parser(new ArgTypes("l", "bool "), new RawArgs("-l", " true")).get("l"));
        assertEquals(false, new Parser(new ArgTypes("l", "bool "), new RawArgs("-l")).get("l"));
    }

    @Test
    public void isThrowParserExceptionWhenArgTypeNotExist() {
        assertThrows(ParserArgsException.class, () -> new Parser(new ArgTypes("l"), new RawArgs("-l")).get("l"));
    }

}
