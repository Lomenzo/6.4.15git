package lastTask;

public class MailMessage extends FromTo<String>{


    public MailMessage(         String from,
                                String to,
     /*для салари будет инт?*/  String content   //здесь контент уже уточняется как строка(для мессаги)
    ) {
        super.from = from;
        super.to = to;
        super.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }
}
