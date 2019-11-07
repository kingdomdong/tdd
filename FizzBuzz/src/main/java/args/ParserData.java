package args;

import org.apache.commons.lang3.StringUtils;

public class ParserData {


    protected String getNextItem(String[] strings, String flag) {
        for (int i = 0; i < strings.length; i++) {
            if (StringUtils.isNotBlank(flag) && flag.equals(strings[i]) && i + 1 < strings.length)
                return strings[++i].trim();
        }
        return "";
    }

}
