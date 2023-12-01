package gof.designpatterns.behavioral.visitor.renting;

public class DVDRenting extends Renting {
    private int numberDisks;

    public int getNumberDisks() {
        return numberDisks;
    }

    public void setNumberDisks(int numberDisks) {
        this.numberDisks = numberDisks;
    }

    @Override
    public void accept(Visitor v) {
        // some code here
        v.visit(this);
    }
}
