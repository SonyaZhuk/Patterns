package gof.designpatterns.behavioral.state.сonnection;

/**
 * интерфейс и классы состояний
 */
public class TCPClosedState implements TCPState {
    @Override
    public void open(TCPConnection context) {
        System.out.println("State Closed: Opening");
    }

    @Override
    public void close(TCPConnection context) {
        System.out.println("State Closed: Closing");
    }

    @Override
    public void synchronize(TCPConnection context) {
        System.out.println("State Closed: Synchronizing");
    }
}