package gof.designpatterns.creational.factory.abstracts.concept;

public class ConcreteFactory implements AbstractFactory {
    public AbstractProduct createProduct() {
        System.out.println("Creating concrete product");
        AbstractProduct product = new ConcreteProduct();
        return product;
    }
}
