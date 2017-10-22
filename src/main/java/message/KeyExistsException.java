package message;

import java.io.Serializable;

public class KeyExistsException extends Exception implements Serializable {
    public final String key;

    public KeyExistsException(String key) {
        this.key = key;
    }
}
