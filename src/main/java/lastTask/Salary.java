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


}
