package lastTask;

import java.util.*;
import java.util.function.Consumer;

//MailService � ���� ������ ����� ����������� ��� ������ (��� ������) � ��� ����� (��� ��) ������� �� ��������<S>
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
        //listString.clear();//����� ������� �������, �� ������ ��� �� ����� �� ��� ������������� �����

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
        // ���������� ������ ������� ��� "Apples", ���� ���� "Apples" ������������
//List<String> fruits = quantities.merge("Apples", new ArrayList<>(), (oldList, newList) -> {oldList.addAll(newList);
//            return oldList;});
        //� ���� �������, ���� ���� "To" ������������ � HashMap, ��� �������� ����� ��������� �����������
        //�������� "stroka" � ������. ���� ����� ���, ����� ������ null.


//        System.out.println(tSendable);
//        System.out.println(stroka);
    }


        //����� �����, ������� ���� ������ ������ �� ��������, ������ ��� ����� ����� ���� ����-���������� (������),
        //� ��� ����, ����� ��� �� ��� ������� - ���������� ������� ��������.������ ������ ��� ����
        // �.�. ����������� ������ 14
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