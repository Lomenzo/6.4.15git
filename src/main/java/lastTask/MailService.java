package lastTask;

import java.util.*;
import java.util.function.Consumer;

//MailService в этой задаче будет использован как строка (для мессаг) и как число (для зп) поэтому он дженерик<S>
public class MailService<T> implements Consumer<Sendable<T>> {

    Map<String, List<String>> hashMap = new MailBox();
    List<String> listString = new ArrayList<>();

    @Override
    public void accept(Sendable<T> tSendable) {
        String stroka = (String)tSendable.getContent();
//        Sendable<String> sSendable = tSendable<>();
        listString.add(stroka);
//        hashMap.merge(tSendable.getTo(), new ArrayList<>(), ArrayList::add(stroka));
//        hashMap.compute(tSendable.getTo(),(k,v) -> (k == null)?(new ArrayList<>()):(v = hashMap.get(k).add("ad")));

//        hashMap.putIfAbsent(tSendable.getTo(), listString);
//        hashMap.computeIfPresent(tSendable.getTo(), List::add(stroka));
        hashMap.merge(tSendable.getTo(),new ArrayList<String>(listString), (old, newlist) -> {old.add(stroka);return old;});
//        hashMap.putIfAbsent(tSendable.getTo(),listString);          //адресат это стринга, а вот содержимое...Т
//        //мапа съедает предыдущую строку листа, перезаписывая поверх, нужно придумать логику IfPresent
        listString.clear();

//        // Alisa:computeIfPresent
//        hashMap.computeIfPresent(tSendable.getTo(),(key, value) -> {List<String> updatedValue = new ArrayList<>(value);
//                    updatedValue.add(stroka);
//                    return updatedValue;
//                });

//        hashMap.merge(tSendable.getTo(), listString, (key, value) -> {List<String> updatedValue = new ArrayList<>(value);
//            updatedValue.add(stroka);
//            return updatedValue;
//        });

    // Alisa:merge
        // Обновление списка фруктов для "Apples", если ключ "Apples" присутствует
//List<String> fruits = quantities.merge("Apples", new ArrayList<>(), (oldList, newList) -> {oldList.addAll(newList);
//            return oldList;});
        //В этом примере, если ключ "To" присутствует в HashMap, его значение будет обновлено добавлением
        //элемента "stroka" в список. Если ключа нет, метод вернет null.


//        System.out.println(tSendable);
//        System.out.println(stroka);
    }


        //Нужен метод, который даст список мессаг по адресату, однако для этого нужно поле мапа-библиотека (строка),
        //и для того, чтобы она всё это хранила - необходимо научить консумер.ассепт класть это туда
        // т.е. реализовать строку 14
    public Map<String, List<String>> getMailBox () {
//        Map<String, List<String>> hashMap = new HashMap<>();
        return hashMap;
    }
}
