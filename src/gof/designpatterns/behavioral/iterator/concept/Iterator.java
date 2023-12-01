package gof.designpatterns.behavioral.iterator.concept;

public interface Iterator {

    // аналог java.util.Iterator
    void first(); // устанавливает итератор в начальную позицию

    boolean isDone();

    // аналог hasNext()
    void next();

    // изменяет позицию итератора, аналог next()
    Object currentItem(); // извлекает объект в текущей позиции, аналог next()
}
