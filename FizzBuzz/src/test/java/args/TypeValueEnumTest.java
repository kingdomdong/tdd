package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeValueEnumTest {
    @Test
    public void isMatchTrueWhenStringIsTrue() {
        assertEquals(true, TypeValueEnum.value(String.class, "True"));
        assertEquals(0, TypeValueEnum.value(Integer.class, "1"));
    }
}
