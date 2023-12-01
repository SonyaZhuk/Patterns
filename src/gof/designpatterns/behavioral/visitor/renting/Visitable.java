package gof.designpatterns.behavioral.visitor.renting;

/**
 * реализация иерархии сущностей с настраиваемым поведением
 * Для представления системы проката используются два класса — ApplianceRenting и DVDRenting.
 */
public interface Visitable {
    void accept(Visitor v);
}
