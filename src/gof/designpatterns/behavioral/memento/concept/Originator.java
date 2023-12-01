package gof.designpatterns.behavioral.memento.concept;

/**
 * класс, сохранением состояния которого занимается Memento
 */
public class Originator {
    private String state = "Initial state";

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void execute() {
        state = "New state";
    }

    @Override
    public String toString() {
        return state;
    }
}
