package lastTask;

//��������������� ���������� (������� ����� �����������?) ��� �������(�����������/�������/����������<T>)
public class FromTo<T> implements Sendable<T>{

    String from;                  //������ ���� ������ �����������(������)
    String to;                    //������ ���� ������ �������(������)
    T content;                    //������ ���� ��� ���� ��(���) ���� �������(������) ������� ����� ��������

    public FromTo() {
    }

    public FromTo(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public T getContent() {
        return content;
    }
}
