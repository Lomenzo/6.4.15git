package lastTask;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MailBox<String,T> extends HashMap<String,List<T>> {

    @Override
    public List<T> get(Object keyString) {
        return super.getOrDefault(keyString, Collections.emptyList());
    }
}
