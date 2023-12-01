package gof.designpatterns.structural.composite.concept;

/**
 * клиентский класс (необязателен), которому необходим составной в качестве поля
 */
public class Client {
    private Component component;

    public Client(Component component) {
        this.component = component;
    }

    public void execute() {
        component.operation();
    }
}

