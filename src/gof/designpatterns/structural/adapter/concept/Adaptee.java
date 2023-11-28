package gof.designpatterns.structural.adapter.concept;

/**
 * адаптируемый класс
 */
public class Adaptee {
    public boolean specificRequest() {
        System.out.println("Return type - boolean");
        return true; // stub
    }
}
