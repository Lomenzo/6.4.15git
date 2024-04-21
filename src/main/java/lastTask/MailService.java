package lastTask;

import java.util.*;
import java.util.function.Consumer;

//MailService в этой задаче будет использован как строка (для мессаг) и как число (для зп) поэтому он дженерик<S>
public class MailService<T> implements Consumer<Sendable<T>> {
//MailService<Integer> salaryService = new MailService<>();
//MailService<String> mailService = new MailService<>();

    //Map<String, List<T>> hashMap = new MailBox();
    //TODO
    HashMap<String, List<T>> hmap = new MailBox<>();
//    Map<String,List<Integer>> hashMapInt = new MailBox<>();
//    List<? extends FromTo<T>> testGenericList = new ArrayList<>();
    List<T> testGenericTList = new ArrayList<>();
    //List<String> listString = new ArrayList<>();

    //String stroka = (String)tSendable.getContent();
    //listString.add(stroka);
    //hashMap.merge(tSendable.getTo(),new ArrayList<String>(listString), (old, newlist) -> {old.add(stroka);return old;});
    //listString.clear();

    @Override
    public void accept(Sendable<T> tSendable) {
        testGenericTList.add(tSendable.getContent());
        hmap.merge(tSendable.getTo(),new ArrayList<>(testGenericTList),
                (old, newlist) -> {old.add(tSendable.getContent());return old;});
        testGenericTList.clear();
        //listString.clear();//кусок старого решения, не уверен что по итогу он был функционально нужен

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
        //Map<String, List<String>> mailBox = mailService.getMailBox();
        //Map<String, List<Integer>> salaries = salaryService.getMailBox();
    public Map<String, List<T>> getMailBox () {
//        Map<String, List<String>> hashMap = new HashMap<>();
        return hmap;
    }
}



    //List<String> listString = new ArrayList<>();

        //String stroka = (String)tSendable.getContent();
        //listString.add(stroka);
        //hashMap.merge(tSendable.getTo(),new ArrayList<String>(listString), (old, newlist) -> {old.add(stroka);return old;});
        //listString.clear();