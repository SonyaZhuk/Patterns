package gof.designpatterns.creational.factory.abstracts.concept;

/**
 * http://allmycircuitz.blogspot.ru/2013/08/abstract-factory.html
 */
public class Runner {

    public static void main(String[] args) {
        Client client = new Client();
        client.setAbstractFactory(new ConcreteFactory());
        client.action();
    }
}
