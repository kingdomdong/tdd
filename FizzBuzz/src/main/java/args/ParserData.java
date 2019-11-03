package args;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParserData {


    public List<String> revise(String ... rawArgs) {
        return Arrays.asList(rawArgs)
                .stream()
                .map(item -> item.trim())
                .collect(Collectors.toList());
    }

    public String getArrayNextValue(List<String> array, String flag) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(flag) && i + 1 < array.size())
                return array.get(++i);
        }
        return "";
    }

}
