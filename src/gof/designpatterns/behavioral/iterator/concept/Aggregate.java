package gof.designpatterns.behavioral.iterator.concept;

/**
 * интерфейс Aggregate и его реализация
 */
public interface Aggregate {
    Iterator createIterator();
}
