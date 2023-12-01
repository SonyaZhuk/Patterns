package gof.designpatterns.behavioral.visitor.renting;

public class ApplianceRenting extends Renting {
    private double redemptionPrice;

    public double getRedemptionPrice() {
        return redemptionPrice;
    }

    public void setRedemptionPrice(double redemptionPrice) {
        this.redemptionPrice = redemptionPrice;
    }

    @Override
    public void accept(Visitor v) {
        // some code here
        v.visit(this);
    }
}