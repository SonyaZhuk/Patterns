package gof.designpatterns.structural.flyweight.concept;

/**
 * Экземпляр класса может использоваться как набор независимых экземпляров.
 * С помощью разделяемого содержимого экземпляра класса возможна экономия
 * ресурсов при инициализации большого числа схожих объектов.
 */
public class Client {
    private FlyweightFactory flyweightFactory;
    private ConcreteFlyweight concreteFlyweight;
    private UnsharedConcreteFlyweight unsharedFlyweight;
}
