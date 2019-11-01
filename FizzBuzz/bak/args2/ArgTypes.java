package args;

import java.util.List;

public class ArgTypes {

    private List<String> argTypes;

    public ArgTypes(String ... argTypes) {
        this.argTypes = ParserUtils.reviseList(argTypes);
    }

    public String getType(String flag) {
        return ParserUtils.getListValue(argTypes, flag);
    }

}
