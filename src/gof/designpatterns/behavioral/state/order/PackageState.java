package gof.designpatterns.behavioral.state.order;

public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}
