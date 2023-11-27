package gof.designpatterns.creational.prototype.concept;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * класс, создающий и использующий копию экземпляра
 */
public class Client {
    private Prototype mPrototype;
    public void operation() {
        Prototype instance = mPrototype.clonePrototype();
    }
}
