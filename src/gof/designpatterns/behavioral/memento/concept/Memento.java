package gof.designpatterns.behavioral.memento.concept;

/**
 * хранитель состояния
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

