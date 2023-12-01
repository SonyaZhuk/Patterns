package gof.designpatterns.behavioral.visitor.concept;

public class ConcreteElement implements Element {
    public void accept (Visitor visitor) {
        Element element = null;
        visitor.visit(element);
    }
}
