package gof.designpatterns.structural.adapter.concept;

/**
 * организация адаптера
 */
public class ConcreteAdapter implements Adapter{
    private Adaptee adaptee;
    public ConcreteAdapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void request() {
        System.out.println("Return type - void.");
        adaptee.specificRequest();
    }
}

