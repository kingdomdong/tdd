package args;

public class RawArgs extends ParserData {

    private String[] rawArgs;

    public RawArgs(String[] rawArgs) {
        this.rawArgs = rawArgs;
    }

    public String getValue(String flag) {
        return getNextItem(rawArgs, "-" + flag);
    }

}
