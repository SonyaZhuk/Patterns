package gof.designpatterns.structural.bridge.logger;

/**
 * абстракция и ее уточнения
 */
public class FileLogger extends Logger {

    public FileLogger() {
    }

    public FileLogger(LoggerImplementor logger) {
        super(logger);
    }

    public void log() {
        logger.logToFile();
    }
}
