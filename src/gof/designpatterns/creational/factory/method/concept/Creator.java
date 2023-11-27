package gof.designpatterns.creational.factory.method.concept;

public abstract class Creator {
    public abstract Product factoryMethod();
    public void anOperation() {
        System.out.println("operation");
    }
}
