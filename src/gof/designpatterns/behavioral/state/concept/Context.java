package gof.designpatterns.behavioral.state.concept;

public class Context {
    private State state;

    public Context() {
        // some code here
    }

    public void changeStateRequest() {
        state.someAction();
    }
}
