package lastTask;

public class MailMessage extends FromTo<String>{


    public MailMessage(         String from,
                                String to,
     /*��� ������ ����� ���?*/  String content   //����� ������� ��� ���������� ��� ������(��� �������)
    ) {
        super.from = from;
        super.to = to;
        this.content = content;
    }

//    @Override
//    public String toString() {
//        return "MailMessage{" +
//                "from='" + from + '\'' +
//                ", to='" + to + '\'' +
//                ", content=" + content +
//                '}';
//    }


}
