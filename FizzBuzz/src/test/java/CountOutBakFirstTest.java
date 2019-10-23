import CountOut.CountOutBakFirst;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CountOutBakFirstTest {

    @Test
    public void isMatchFizzWhenDivideByThree() {
        checkCountOut(3, "fizz");
    }

    @Test
    public void isMatchBuzzWhenDivideByFive() {
        checkCountOut(5, "buzz");
    }

    @Test
    public void isMatchFizzBuzzWhenDivideByFifteen() {
        checkCountOut(15, "fizzbuzz");
    }

    @Test
    public void isMatchFizzWhenRelateThree() {
        checkCountOut(34, "fizz");
    }

    @Test
    public void isMatchBuzzWhenRelateFive() {
        checkCountOut(53, "fizzbuzz");
        checkCountOut(35, "fizzbuzz");
        checkCountOut(54, "fizzbuzz");
    }

    private void checkCountOut(int input, String countOut) {
        assertThat(new CountOutBakFirst(input).content(), is(countOut));
    }

}
