package lastTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MailSalaryBox extends MailBox<String, List<Integer>> {

    public MailSalaryBox() {
    }

    @Override
    public List<Integer> get(Object keyString) {
        List<Integer> emptyListForEqualsTest = new ArrayList<>();
        return super.getOrDefault(keyString,emptyListForEqualsTest);
    }
}