package gof.designpatterns.behavioral.state.сonnection;

/**
 *  интерфейс и классы состояний
 */
public interface TCPState {
    void open(TCPConnection context);
    void close(TCPConnection context);
    void synchronize (TCPConnection context);
}
