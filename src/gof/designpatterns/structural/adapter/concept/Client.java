package gof.designpatterns.structural.adapter.concept;

/**
 * адаптируемый класс
 */
public class Client {
    private Adapter target;
    public Client(Adapter target) {
        this.target = target;
    }
    public void execute(Adapter target) {
        target.request();
    }
}

