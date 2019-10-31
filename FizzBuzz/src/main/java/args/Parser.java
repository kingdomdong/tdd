package args;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Parser {

    private String args;

    public Parser(String args) {
        this.args = args;
    }

    public Parser(String s, String[] strings) {
    }

    public Map<String, String> argMap() {
        List<String> argList = splitArgs();
        Map<String, String> map = new HashMap<>(argList.size());
        argList.stream().forEach(arg -> {
            List<String> item = splitStringToList(arg, " ");
            map.put(item.get(0), item.size() > 1 ? item.get(1) : null);
        });
        return map;
    }

    public boolean checkArgs() {
        if (StringUtils.isBlank(args)) {
            throw new ParserArgsException("args list is empty");
        }
        if (!args.contains("-")) {
            throw new ParserArgsException("args doesn't contain -");
        }
        return true;
    }

    public List<String> splitArgs() {
        checkArgs();
        return splitStringToList(args, "-");
    }

    private List<String> splitStringToList(String string, String regex) {
        List<String> rawList = new ArrayList<>(Arrays.asList(string.trim().split(regex)));
        return rawList.stream()
                .filter(elem -> StringUtils.isNotBlank(elem))
                .map(elem -> elem.trim())
                .collect(Collectors.toList());
    }

}
