package args;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RawArgs {
    private List<String> rawArgs;

    public RawArgs(String ... rawArgs) {
        this.rawArgs = reviseArgs(Arrays.asList(rawArgs));
    }

    public List<String> reviseArgs(List<String> rawArgs) {
        return rawArgs.stream().map(elem -> elem.trim()).collect(Collectors.toList());
    }

    public String getValue(String flag) {
        for (int i = 0; i < rawArgs.size(); i++) {
            if (rawArgs.get(i).equals("-" + flag) && i + 1 < rawArgs.size())
                return rawArgs.get(i + 1);
        }

        return "";
    }

}
