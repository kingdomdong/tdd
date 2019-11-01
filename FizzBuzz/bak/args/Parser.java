package args;

public class Parser {
    private ArgTypes argTypes;
    private RawArgs rawArgs;

    public Parser(ArgTypes argTypes, RawArgs rawArgs) {
        this.argTypes = argTypes;
        this.rawArgs = rawArgs;
    }

    public Object get(String flag) {
        if ("str".equals(argTypes.getType(flag)))
            return rawArgs.getValue(flag);
        if ("bool".equals(argTypes.getType(flag)))
            return Boolean.parseBoolean(rawArgs.getValue(flag));
        if ("int".equals(argTypes.getType(flag)))
            return Integer.parseInt(rawArgs.getValue(flag));

        throw new ParserArgsException("-" + flag + " type is invalid. please enter again");
    }

}
