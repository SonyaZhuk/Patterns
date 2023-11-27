package gof.designpatterns.creational.singleton.threadsafe;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * При создании единственного экземпляра в режиме многопоточности следует гарантировать невозможность получить не до конца
 * сконструированный объект и при этом не потерять в производительности из-за постоянного контроля ссылки логов синхронизации.
 * В одном из допустимых решений этой проблемы прибегают к volatile переменной.
 */
public class VolatileImpl {
    private static VolatileImpl instance = null;
    private volatile static boolean instanceCreated = false;

    private VolatileImpl() {
    }

    public static VolatileImpl getInstance() {
        if (!instanceCreated) {
            synchronized (VolatileImpl.class) {
                // или любой другой тип блокировки
                // например, Lock или Semaphore
                try {
                    if (!instanceCreated) {
                        instance = new VolatileImpl();
                        instanceCreated = true;
                    }
                } catch (Exception e) {
                    // обработка исключительной ситуации
                    // при инициализации
                }
            }
        }
        return instance;
    }
}