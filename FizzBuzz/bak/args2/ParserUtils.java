package args;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParserUtils {

    public static List<String> reviseList(String ... rawArray) {
        return Arrays.asList(rawArray).stream().map(arg -> arg.trim()).collect(Collectors.toList());
    }

    public static String getListValue(List<String> list, String flag) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(flag) && i + 1 < list.size())
                return list.get(++i);
        }

        return ""; // for parsing default values
    }

}
