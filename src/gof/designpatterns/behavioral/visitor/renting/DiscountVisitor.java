package gof.designpatterns.behavioral.visitor.renting;

public class DiscountVisitor implements Visitor {
    @Override
    public void visit(DVDRenting service) {
        System.out.println("Discount DVD renting service");
    }

    @Override
    public void visit(ApplianceRenting service) {
        System.out.println("Discount Appliance renting service");
    }
}
