package gof.designpatterns.structural.bridge.logger;

/**
 * абстракция и ее уточнения
 */
public class ConsoleLogger extends Logger {

    public ConsoleLogger() {
    }

    public ConsoleLogger(LoggerImplementor logger) {
        super(logger);
    }

    public void log() {
        logger.logToConsole();
    }
}

