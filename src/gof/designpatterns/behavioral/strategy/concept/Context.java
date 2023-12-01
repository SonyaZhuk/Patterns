package gof.designpatterns.behavioral.strategy.concept;

/**
 * контекст выбора и исполнения алгоритма
 * Все алгоритмы полностью реализуются в подклассах Strategy так, что все алгоритмы внешне отличаются только по
 * названиям классов, их инкапсулирующих. Для смены алгоритма достаточно изменить объект в поле класса Context
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void contextInterface() {
        strategy.algorithm();
    }
}

