package gof.designpatterns.behavioral.visitor.renting;

/**
 * Visitor и его реализации
 */
public interface Visitor {
    void visit(DVDRenting service);
    void visit(ApplianceRenting service);
}
