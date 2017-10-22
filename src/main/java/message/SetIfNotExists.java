package message;

public class SetIfNotExists {
    private final String key;
    private final Object value;

    public SetIfNotExists(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
