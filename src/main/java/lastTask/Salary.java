package lastTask;

public class Salary extends FromTo<Integer>{

    public Salary(              String from,
                                String to,
            /*��� ������ ����� ���?*/  Integer content   //����� ������� ��� ���������� ��� ������(��� �������)
    ) {
        super.from = from;
        super.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getContent() {
        return content;
    }

}
