package gof.designpatterns.creational.factory.method.concept;

public class ConcreteCreator extends Creator {
    public Product factoryMethod() {
        // подготовительные действия
        this.anOperation();
        return new ConcreteProduct();
    }
}
