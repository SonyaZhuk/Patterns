package gof.designpatterns.behavioral.iterator.concept;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate сoncreteAggregate;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        сoncreteAggregate = aggregate;
    }

    public void first() {
        // First element in concreteAggregate
    }

    public void next() {
        // Next element in concreteAggregate
    }

    public boolean isDone() {
        // Check whether the end is reached
        return false;
    }

    public Object currentItem() {
        // Return current item in concreteAggregat
        return null;
    }
}

