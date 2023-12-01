package gof.designpatterns.behavioral.memento.concept;

public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator.createMemento());
        System.out.println(originator);
        originator.execute();
        System.out.println(originator);
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator);
    }
}
