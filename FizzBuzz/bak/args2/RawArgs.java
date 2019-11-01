package args;

import java.util.List;

public class RawArgs {


    private List<String> rawArgs;

    public RawArgs(String ... rawArgs) {
        this.rawArgs = ParserUtils.reviseList(rawArgs);
    }

    public String getValue(String flag) {
        return ParserUtils.getListValue(rawArgs, "-" + flag);
    }

}
