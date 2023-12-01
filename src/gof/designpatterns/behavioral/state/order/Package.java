package gof.designpatterns.behavioral.state.order;

public class Package {
    private PackageState state = new OrderedState();

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
