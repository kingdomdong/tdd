package args;

import java.util.stream.Stream;

public class Parser {
    private ArgTypes argTypes;
    private RawArgs rawArgs;

    public Parser(ArgTypes argTypes, RawArgs rawArgs) {
        this.argTypes = argTypes;
        this.rawArgs = rawArgs;
    }

    public<T extends Object> T get(String flag) {
        if ("bool".equals(argTypes.getType(flag))) {
            T t = (T) (Boolean.parseBoolean(rawArgs.getValue(flag)));
            return t;
        }

//        if ("str".equals(argTypes.getType(flag)))
//            return (T)rawArgs.getValue(flag);
//
//        if ("int".equals(argTypes.getType(flag)))
//            return rawArgs.getValue(flag).equals("")
//                    ? 0
//                    : Integer.parseInt(rawArgs.getValue(flag));
//
//        if ("strlist".equals(argTypes.getType(flag)))
//            return rawArgs.getValue(flag).split(",");
//
//        if ("intlist".equals(argTypes.getType(flag)))
//            return Stream.of(rawArgs.getValue(flag).split(","))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();

        throw new ParserArgsException("-" + flag + " type is illegal, please try again");
    }

}
