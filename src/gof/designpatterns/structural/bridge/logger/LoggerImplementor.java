package gof.designpatterns.structural.bridge.logger;

/**
 * абстракция и ее уточнения
 */
public interface LoggerImplementor {
    void logToConsole();

    void logToFile();

    void logToSocket();
}
