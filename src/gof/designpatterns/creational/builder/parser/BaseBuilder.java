package gof.designpatterns.creational.builder.parser;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * Класс BaseBuilder определяет абстрактный интерфейс для создания частей объекта класса User
 */
public abstract class BaseBuilder {

    protected User user = new User();

    public User getUser() {
        return user;
    }

    public abstract void buildLogin();

    public abstract void buildPassword();
    // public abstract void buildUser(); // возможен как вариант
}
