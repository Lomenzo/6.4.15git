package lastTask;

public class Salary extends FromTo<Integer>{

    public Salary(              String from,
                                String to,
            /*для салари будет инт?*/  Integer content   //здесь контент уже уточняется как строка(для мессаги)
    ) {
        super.from = from;
        super.to = to;
        this.content = content;
    }


}
