package args;

import org.apache.commons.lang3.StringUtils;

public class Parser {

    private ArgTypes argTypes;
    private RawArgs rawArgs;

    public Parser(String[] argTypes, String[] rawArgs) {
        this.argTypes = new ArgTypes(argTypes);
        this.rawArgs = new RawArgs(rawArgs);
    }

    public Object get(String flag) {
        if (isTypeEquals(flag, "bool")) {
            return getBooleanArg(flag);
        }

        if (isTypeEquals(flag, "int")) {
            return getIntArg(flag);
        }

        return "";
    }

    private Object getIntArg(String flag) {
        return Integer.parseInt(StringUtils.isBlank(rawArgs.getValue(flag)) ? "0" : rawArgs.getValue(flag));
    }

    private Object getBooleanArg(String flag) {
        return Boolean.parseBoolean(rawArgs.getValue(flag));
    }

    private boolean isTypeEquals(String flag, String bool) {
        return bool.equals(argTypes.getType(flag));
    }

}
