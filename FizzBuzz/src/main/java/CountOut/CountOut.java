package CountOut;

import static java.lang.String.valueOf;

public class CountOut {
    private int number;

    public CountOut(int number) {

        this.number = number;
    }

    public String say() {
        if (isDivisible(3) && isDivisible(5))
            return "FizzBuzz";
        if (isDivisible(3))
            return "Fizz";
        if (isDivisible(5))
            return "Buzz";

        return valueOf(number);
    }

    private boolean isDivisible(int i) {
        return number % i == 0;
    }
}
