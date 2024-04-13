package lastTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

//MailService в этой задаче будет использован как строка (для мессаг) и как число (для зп) поэтому он дженерик<S>
public class MailService<FromTo> implements Consumer<FromTo> {

//    Map<String, List<String>> hashMap = new HashMap<>();

    Consumer<String> printConsumer = t -> System.out.println(t);
    Consumer<Integer> countConsumer = t -> System.out.println(t+5);

    @Override
    public void accept(Object o) {

    }

    @Override
    public Consumer andThen(Consumer after) {
        return Consumer.super.andThen(after);
    }
}
