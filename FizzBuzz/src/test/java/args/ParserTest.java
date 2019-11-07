package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {

    @Test
    public void isMatchTrueWhenArgsLegal() {
        String[] argTypes = {"l", " bool", "p", "int"};
        String[] rawArgs = {"-l", "true", "-p"};
        assertEquals(true, new Parser(argTypes, rawArgs).get("l"));
        assertEquals(0, new Parser(argTypes, rawArgs).get("p"));
    }

}
