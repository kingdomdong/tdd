package countout;

import static java.lang.String.valueOf;

public class CountOutBakSixth {
    private Integer number;

    public CountOutBakSixth(Integer number) {

        this.number = number;
    }

    public String say() {
        if (isRelate(3) && isRelate(5)) {
            return "FizzBuzz";
        }
        if (isRelate(3)) {
            return "Fizz";
        }
        if (isRelate(5)) {
            return "Buzz";
        }
        return valueOf(number);
    }

    private boolean isRelate(int givenNum) {
        return number % givenNum == 0 || valueOf(number).contains(valueOf(givenNum));
    }
}
