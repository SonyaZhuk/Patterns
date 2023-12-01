package gof.designpatterns.behavioral.iterator.concept;

public class ConcreteAggregate implements Aggregate {
    public Iterator createIterator() {
        System.out.println("Creating concrete iterator for concrete aggregate.");
        Iterator iterator = new ConcreteIterator(this);
        return iterator;
    }
}

