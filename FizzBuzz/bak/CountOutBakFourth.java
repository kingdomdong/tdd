package CountOut;

import static java.lang.String.valueOf;

public class CountOutBakFourth {
    private Integer number;

    public CountOutBakFourth(Integer number) {
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
