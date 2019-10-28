package CountOut;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountOutTest {
    @Test
    public void isMatchWhen() {
        checkWord(1, "1");
    }

    @Test
    public void isMatchFizzWhenNumIsThree() {
        checkWord(3, "Fizz");
    }

    @Test
    public void isMatchBuzzWhenNumIsFive() {
        checkWord(5, "Buzz");
    }

    @Test
    public void isMatchFizzBuzzWhenNumIsFifteen() {
        checkWord(15, "FizzBuzz");
    }

    private void checkWord(int number, String word) {
        assertThat(new CountOut(number).say(), is(word));
    }
}
