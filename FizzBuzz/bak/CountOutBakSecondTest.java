import countout.CountOutBakSecond;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CountOutBakSecondTest {

    @Test
    public void isMatchOriginWhenOne() {
        checkCountOutWord(1, "1");
    }

    @Test
    public void isMatchFizzWhenNumIsSix() {
        checkCountOutWord(6, "Fizz");
    }


    @Test
    public void isMatchBuzzWhenNumIsFive() {
        checkCountOutWord(5, "Buzz");
    }

    @Test
    public void isMatchFizzBuzzWhenNumIsFifteen() {
        checkCountOutWord(15, "FizzBuzz");
    }

    @Test
    public void isMatchFizzBuzzWhenNumIsFiftythree() {
        checkCountOutWord(53, "FizzBuzz");
        checkCountOutWord(35, "FizzBuzz");
        checkCountOutWord(75, "FizzBuzz");
    }


    private void checkCountOutWord(int num, String word) {
        assertThat(new CountOutBakSecond(num).say(), is(word));
    }

}
