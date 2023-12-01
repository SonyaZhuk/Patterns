package gof.designpatterns.behavioral.memento.concept;

/**
 * восстанавливает сохраненное состояние
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