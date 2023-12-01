package gof.designpatterns.behavioral.iterator.concept;

/**
 * использование итератора
 */
public class RunnerIteratorDemo {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        iterator.first();

        while (!iterator.isDone()) {
            iterator.currentItem();
            iterator.next();
        }
    }
}
