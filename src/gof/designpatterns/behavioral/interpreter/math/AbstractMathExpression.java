package gof.designpatterns.behavioral.interpreter.math;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * реализация вычислительной логики Interpreter
 * <p>
 * В терминальных классах, ассоциированных с математическими действиями, метод interpret()
 * извлекает значения из объекта Context, выполняет действие и записывает результат в тот же объект.
 * Реализация для чисел только добавляет число в контекст.
 */
public abstract class AbstractMathExpression {
    public abstract void interpret(Context context);
}
