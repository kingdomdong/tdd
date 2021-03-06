package countout;

import static java.lang.String.valueOf;

public class CountOutBakFirst {

    private final int index;

    public CountOutBakFirst(int index) {
        this.index = index;
    }


    public String content() {
        if (isRelated(3) && isRelated(5)) return "fizzbuzz";
        if (isRelated(3)) return "fizz";
        if (isRelated(5)) return "buzz";

        return valueOf(index);
    }

    private boolean isRelated(int i) {
        return index % i == 0 || valueOf(index).contains(valueOf(i));
    }
}
