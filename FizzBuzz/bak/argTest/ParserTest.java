package args;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {

    @Test
    public void isMatchTrueWhenArgsNormal() {
        assertEquals(Boolean.TRUE, new Parser(new ArgTypes("l", "bool"), new RawArgs("-l", "true")).get("l"));
        assertEquals(Boolean.TRUE, new Parser(new ArgTypes("l", "bool"), new RawArgs("-l", "")).get("l"));
    }

//    private final String normalArgs = "-l true  -p 8080 -m -t 90 -s";
//    private final String blankArgs = " ";
//
//    @Test
//    public void isMatchNumWhenListExist() {
//        assertEquals(splitArgs(normalArgs).size(), 5);
//    }
//
//    @Test
//    public void isMatchItemWhenListExist() {
//        assertTrue(splitArgs(normalArgs).contains("l true"));
//    }
//
//    @Test
//    public void isMatchParsarExceptionWhenListIsNull() {
//        assertThrows(ParserArgsException.class, () -> new Parser(null).checkArgs());
//    }
//
//    @Test
//    public void isMatchParserExceptionWhenListNotContainFlag() {
//        ParserArgsException ex = assertThrows(ParserArgsException.class, () -> new Parser("p 90").checkArgs());
//        assertTrue(ex.getMessage().contains("args doesn't contain -"));
//    }
//
//    @Test
//    public void isMatchBlankExceptionWhenListIsBlank() {
//        assertThrows(ParserArgsException.class, () -> splitArgs(blankArgs));
//        assertThrows(ParserArgsException.class, () -> splitArgs(null));
//    }
//
//    @Test
//    public void isMatchValuesWhenArgsSplited() {
//        assertEquals("true", new Parser(normalArgs).argMap().getType("l"));
//    }
//
//    @Test
//    public void isMatchTrueWhenArrayContainsLogTrue() {
//        assertEquals(true, new Parser(new ArgTypes("l", "bool"), new RawArgs("-l", "true")).getType("l"));
//    }
//
//    private List<String> splitArgs(String testArgs) {
//        return new Parser(testArgs).splitArgs();
//    }

}
