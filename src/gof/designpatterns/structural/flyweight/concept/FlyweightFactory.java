package gof.designpatterns.structural.flyweight.concept;

public class FlyweightFactory {
    private Flyweight flyweight;

    public Flyweight getFlyweight() {
        return new ConcreteFlyweight();
    }
}

