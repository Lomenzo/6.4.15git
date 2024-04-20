package lastTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class MailBox<K,V> extends HashMap<K,V> {

    protected MailBox() {
    }
    //    @Override
//    public List<String> get(Object keyString) {
//        List<String> emptyListForEqualsTest = new ArrayList<>();
//        return super.getOrDefault(keyString,emptyListForEqualsTest);
//    }
}
