package args;

import java.util.List;

public class ArgTypes extends ParserData {

    private List<String> argTypes;

    public ArgTypes(String ... argTypes) {
        this.argTypes = revise(argTypes);
    }

    public String getType(String flag) {
        return getArrayNextValue(argTypes, flag);
    }

}
