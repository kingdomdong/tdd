package CountOut;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountOutBakNinthTest {
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
        checkWord(52, "Buzz"); // Ops, 51 contains 5 & it can be divided by 3.
    }

    @Test
    public void isMatchFizzBuzzWhenNumRelateThreeAndFive() {
        checkWord(51, "FizzBuzz");
        checkWord(53, "FizzBuzz");
        checkWord(35, "FizzBuzz");
        checkWord(75, "FizzBuzz");
    }

    private void checkWord(int number, String word) {
        assertThat(new CountOutBakNinth(number).say(), is(word));
    }
}
