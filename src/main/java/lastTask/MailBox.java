package lastTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MailBox extends HashMap<String, List<String>> {

    @Override
    public List<String> get(Object keyString) {
        List<String> emptyListForEqualsTest = new ArrayList<>();
        return super.getOrDefault(keyString,emptyListForEqualsTest);
    }
}
