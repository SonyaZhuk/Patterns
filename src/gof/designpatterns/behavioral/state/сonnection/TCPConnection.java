package gof.designpatterns.behavioral.state.сonnection;

/**
 * класс с изменяемым состоянием
 * <p>
 * Пусть для приема-передачи данных используется экземпляр TCPConnection.
 * Соединение может находиться в трех соостояниях: открытое, закрытое и установленное.
 * При задании состояния оно должно открываться, а перед переходом в другое состояние обязательно закрываться.
 * В период нахождения в состоянии оно может быть синхронизировано.
 */
public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        state = new TCPClosedState();
    }

    public void open() {
        state.open(this);
        this.changeState(new TCPOpenState());
    }

    public void close() {
        state.close(this);
        this.changeState(new TCPClosedState());
    }

    public void synchronize() {
        state.synchronize(this);
        this.changeState(new TCPEstablishedState());
    }

    private void changeState(TCPState state) {
        this.state = state;
    }
}

