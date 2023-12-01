package gof.designpatterns.behavioral.observer.concept;

import java.util.ArrayList;

/**
 * интерфейс и изменение состояний объекта
 */
public class ConcreteSubject implements Subject {
    public ArrayList<Observer> observer;
    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object value) {
    }

    public void attach(Observer ob) {
    }

    public void detach(Observer ob) {
    }

    public void notifyObservers() {
    }
}

