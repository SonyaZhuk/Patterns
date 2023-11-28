package gof.designpatterns.structural.bridge.logger;

public class SingleThreadedLogger implements LoggerImplementor {
    @Override
    public void logToConsole() {
        System.out.println("Singlethreaded console log");
    }

    @Override
    public void logToFile() {
        System.out.println("Singlethreaded file log");
    }

    @Override
    public void logToSocket() {
        System.out.println("Singlethreaded socket log");
    }
}

