package lastTask;

import java.util.*;
import java.util.function.Consumer;

//MailService � ���� ������ ����� ����������� ��� ������ (��� ������) � ��� ����� (��� ��) ������� �� ��������<S>
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
//        hashMap.putIfAbsent(tSendable.getTo(),listString);          //������� ��� �������, � ��� ����������...�
//        //���� ������� ���������� ������ �����, ������������� ������, ����� ��������� ������ IfPresent
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
    public Map<String, List<String>> getMailBox () {
//        Map<String, List<String>> hashMap = new HashMap<>();
        return hashMap;
    }
}
