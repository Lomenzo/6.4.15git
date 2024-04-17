package lastTask;

public interface Sendable<T> {
    public String getFrom();

    public String getTo();

    public T getContent();

}
