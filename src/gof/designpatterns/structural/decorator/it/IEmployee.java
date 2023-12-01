package gof.designpatterns.structural.decorator.it;

/**
 * определение интерфейса для общих действий
 */
public interface IEmployee {
    // может быть представлен абстрактным классом
    void openTask();

    void reopenTask();

    void resolveTask();
}
