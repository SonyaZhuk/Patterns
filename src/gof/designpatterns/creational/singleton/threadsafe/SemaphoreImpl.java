package gof.designpatterns.creational.singleton.threadsafe;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * В случае, если шаблон Singleton подразумевает ограничение на количество ссылок больше одной,
 * то удобно использовать инициализацию через Semaphore.
 */
public class SemaphoreImpl {
    private static final int MAX_AVAILABLE = 10;
    // лимит экземпляров списка
    private static Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);
    private static ArrayList<SemaphoreImpl> instances = new ArrayList<SemaphoreImpl>(MAX_AVAILABLE);

    private SemaphoreImpl() {
    }

    public static SemaphoreImpl getInstance(int index) throws SingletonException {
        if (index >= 0 && index < instances.size()) {
            // доступ к элементу списка
            return instances.get(index);
        }
        if (semaphore.tryAcquire()) {
            // уменьшение значение семафора на 1
            SemaphoreImpl tmp = new SemaphoreImpl();
            instances.add(tmp);
            return tmp;
        }
        throw new SingletonException("Превышен лимит на число экземпляров");
    }
}


