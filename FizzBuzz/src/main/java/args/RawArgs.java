package args;

import java.util.List;

public class RawArgs extends ParserData {

    private List<String> rawArgs;

    public RawArgs(String ... rawArgs) {
        this.rawArgs = revise(rawArgs);
    }

    public String getValue(String flag) {
        return getArrayNextValue(rawArgs, "-" + flag);
    }

}
