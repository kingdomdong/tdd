package args;

public class ArgTypes extends ParserData {

    private String[] argTypes;

    public ArgTypes(String[] argTypes) {
        this.argTypes = argTypes;
    }

    public String getType(String flag) {
         return getNextItem(argTypes, flag);
    }

}
