package args;

import java.lang.reflect.Type;

public enum TypeValueEnum {
    STRING(String.class, "");

    private Class clazz;
    private Object value;

    public static Object value(Type type, String str) {
        if (str == null)
            return false;
        return Boolean.parseBoolean(str);
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    TypeValueEnum(Class clazz, Object value) {
        this.clazz = clazz;
        this.value = value;
    }
}
