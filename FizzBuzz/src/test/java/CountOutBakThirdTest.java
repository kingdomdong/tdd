import CountOut.CountOutBakThird;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountOutBakThirdTest {

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
        checkWord(23, "Fizz");
    }

    @Test
    public void isMatchBuzzWhenNumRelateFive() {
        checkWord(52, "Buzz");
    }

    @Test
    public void isMatchFizzBuzzWhenNumRelateThreeAndFive() {
        checkWord(53, "FizzBuzz");
        checkWord(35, "FizzBuzz");
        checkWord(57, "FizzBuzz");
    }

    private void checkWord(Integer number, String value) {
        assertThat(new CountOutBakThird(number).say(), is(value));
    }

}
