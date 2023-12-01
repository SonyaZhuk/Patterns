package gof.designpatterns.behavioral.visitor.concept;

/**
 * представление, над которым выполняет действия Visitor
 */
public interface Element {
    void accept (Visitor visitor);
}
