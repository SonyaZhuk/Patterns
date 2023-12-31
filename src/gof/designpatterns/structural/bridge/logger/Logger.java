package gof.designpatterns.structural.bridge.logger;

public abstract class Logger {
    protected LoggerImplementor logger;

    public Logger() {
    }

    public Logger(LoggerImplementor logger) {
        this.logger = logger;
    }

    public void setLogger(LoggerImplementor logger) {
        this.logger = logger;
    }

    public abstract void log();
}
