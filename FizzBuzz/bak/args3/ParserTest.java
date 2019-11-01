package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    @Test
    public void isMatchTrueWhenListGetFlagL() {
        assertEquals(false, new Parser(new ArgTypes("l", "bool"), new RawArgs("-l", "")).get("l"));
        assertEquals(false, new Parser(new ArgTypes("l", "bool", "p", "int"), new RawArgs()).get("l"));
        assertEquals(0, new Parser(new ArgTypes("p", "int", "l"), new RawArgs("-l", "false")).get("p"));
    }

    @Test
    public void isThrowParserExceptionWhenTypeIllegal() {
        assertThrows(ParserArgsException.class, () -> new Parser(new ArgTypes("l"), new RawArgs("-l")).get("l"));
    }

    @Test
    public void isMatchStringListWhenTypeIsStrList() {
        assertArrayEquals(new String[]{"this", "is", "a", "list"},
                (String[]) new Parser(new ArgTypes("g", "strlist"), new RawArgs("-g", "this,is,a,list")).get("g"));
    }

    @Test
    public void isMatchIntListWhenTypeIsIntList() {
        assertArrayEquals(new int[]{1, -9, 8},
                (int[]) new Parser(new ArgTypes("d", "intlist"), new RawArgs("-d", "1,-9,8")).get("d")
        );
    }

}
