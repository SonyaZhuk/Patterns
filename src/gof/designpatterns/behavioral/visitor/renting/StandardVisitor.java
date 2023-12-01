package gof.designpatterns.behavioral.visitor.renting;

public class StandardVisitor implements Visitor {
    @Override
    public void visit(DVDRenting service) {
        System.out.println("Standard DVD renting service");
    }

    @Override
    public void visit(ApplianceRenting service) {
        System.out.println("Standard Appliance renting service");
    }
}
