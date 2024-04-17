package lastTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

//MailService в этой задаче будет использован как строка (для мессаг) и как число (для зп) поэтому он дженерик<S>
public class MailService<T> implements Consumer<Sendable<T>> {

    Map<String, List<String>> hashMap = new HashMap<>();

    @Override
    public void accept(Sendable<T> tSendable) {
        String a = (String)tSendable.getContent();
//        Sendable<String> sSendable = tSendable<>();
        List<String> listString = new ArrayList<>();
        listString.add(a);
        hashMap.putIfAbsent(tSendable.getTo(),listString);          //адресат это стринга, а вот содержимое...Т
//        System.out.println(tSendable);
//        System.out.println(a);
    }



        //Нужен метод, который даст список мессаг по адресату, однако для этого нужно поле мапа-библиотека (строка),
        //и для того, чтобы она всё это хранила - необходимо научить консумер.ассепт класть это туда
        // т.е. реализовать строку 14
    public Map<String, List<String>> getMailBox () {
//        Map<String, List<String>> hashMap = new HashMap<>();
        return hashMap;
    }
}
