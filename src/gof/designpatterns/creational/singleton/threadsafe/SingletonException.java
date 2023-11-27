package gof.designpatterns.creational.singleton.threadsafe;

public class SingletonException extends Exception {
    public SingletonException() {
    }

    public SingletonException(String error) {
        super(error);
    }
}
