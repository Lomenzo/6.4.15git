package lastTask;

//вспомогательная абстракция (сделать класс абстрактным?) для Посылки(отправитель/адресат/содержимое<T>)
public class FromTo<T> implements Sendable<T>{

    String from;                  //первое поле всегда отправитель(строка)
    String to;                    //второе поле всегда адресат(строка)
    T content;                    //третье поле это либо ЗП(инт) либо мессага(стринг) поэтому здесь дженерик

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
