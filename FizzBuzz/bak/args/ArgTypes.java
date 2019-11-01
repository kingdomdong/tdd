package args;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArgTypes {

    private List<String> argTyps;

    public ArgTypes(String... argTyps) {
        this.argTyps = reviseTypes(Arrays.asList(argTyps));
    }

    public List<String> reviseTypes(List<String> argTyps) {
        return argTyps.stream().map(elem -> elem.trim()).collect(Collectors.toList());
    }

    public String getType(String flag) {
        for (int i = 0; i < argTyps.size(); i++) {
            if (argTyps.get(i).equals(flag) && i + 1 < argTyps.size())
                return argTyps.get(i + 1);
        }

        return "";
    }

}
