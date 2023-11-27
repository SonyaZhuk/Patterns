package gof.designpatterns.creational.factory.abstracts.concept;

public class Client {
    private AbstractFactory abstractFactory;
    private AbstractProduct abstractProduct;
    public void action() {
        abstractProduct = abstractFactory.createProduct();
        abstractProduct.info();
    }

    public void setAbstractFactory(AbstractFactory factory) {
        abstractFactory = factory;
    }
}
