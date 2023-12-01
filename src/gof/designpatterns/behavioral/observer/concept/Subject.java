package gof.designpatterns.behavioral.observer.concept;

/**
 * интерфейс и изменение состояний объекта
 */
public interface Subject {
    void attach(Observer ob);
    void detach(Observer ob);
    void notifyObservers();
}
