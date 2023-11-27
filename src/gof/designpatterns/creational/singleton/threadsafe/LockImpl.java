package gof.designpatterns.creational.singleton.threadsafe;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * Для обеспечения синхронизации без инициализации экземпляра в статическом поле можно использовать
 * класс ReentrantLock:
 */
public class LockImpl {
    private static LockImpl instance = null;
    private static ReentrantLock lock = new ReentrantLock();

    private LockImpl() {
    }

    public static LockImpl getInstance() {
        lock.lock();
        try {
            if (instance == null) {
                instance = new LockImpl();
            }
        } finally {
            lock.unlock();
        }
        return instance;
    }
}