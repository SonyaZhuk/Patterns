package gof.designpatterns.behavioral.iterator.session;

public interface CustomIterator {
    void first();
    void next();
    boolean isDone();
    Object currentItem();
}
