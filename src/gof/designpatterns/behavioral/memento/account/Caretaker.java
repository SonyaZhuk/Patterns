package gof.designpatterns.behavioral.memento.account;

/**
 * хранитель Memento
 */
public class Caretaker {
    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
