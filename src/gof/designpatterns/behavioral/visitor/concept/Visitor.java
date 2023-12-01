package gof.designpatterns.behavioral.visitor.concept;

import gof.designpatterns.behavioral.visitor.concept.Element;

/**
 * определение и реализация метода для каждого подкласса класса
 */
public interface Visitor {
    void visit (Element element);
}
