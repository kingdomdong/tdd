package CountOut;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountOutBakFourthTest {
    @Test
    public void isMatchRawWhenNumIsOne() {
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

    @Test
    public void isMatchFizzWhenNumRelateThree() {
        checkWord(31, "Fizz");
    }

    @Test
    public void isMatchBuzzWhenNumRelateFive() {
        checkWord(51, "FizzBuzz"); // Ops, 51 can be divided by 3 & it contains 5.
        checkWord(53, "FizzBuzz");
        checkWord(35, "FizzBuzz");
    }

    private void checkWord(int number, String word) {
        assertThat(new CountOutBakFourth(number).say(), is(word));
    }

}
