package lastTask;

public class MailMessage extends FromTo<String>{


    public MailMessage(         String from,
                                String to,
     /*для салари будет инт?*/  String content   //здесь контент уже уточняется как строка(для мессаги)
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
