package gof.designpatterns.creational.factory.method.concept;

/**
 * base realization the FactoryMethod.
 */
public class FactoryMethodRunner {

    public static void main(String[ ] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.check();
    }
}
