package gof.designpatterns.structural.bridge.logger;

/**
 * использование шаблона Bridge
 *
 * использования шаблона Bridge при создании собственного логгера.
 */
public class BridgeClient {

    public static void main(String[] args) {
        LoggerImplementor loggerImpl = new SingleThreadedLogger();
        Logger logger = new ConsoleLogger(loggerImpl);
        logger.log();
        loggerImpl = new MultiThreadedLogger();
        logger.setLogger(loggerImpl);
        logger.log();
        new FileLogger(loggerImpl).log();
    }
}

