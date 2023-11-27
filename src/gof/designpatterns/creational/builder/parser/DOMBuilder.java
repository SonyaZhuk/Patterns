package gof.designpatterns.creational.builder.parser;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * Классы DomBuilder, SAXBuilder и StAXBuilder конструируют и собирают вместе части объекта класса User,
 * а также представляяют внешний интерфейс для доступа к нему.
 */
public class DOMBuilder extends BaseBuilder {

   // инициализация парсера DOM
    public void buildLogin() {
        // чтение логина
    }
    public void buildPassword() {
        // чтение пароля
    }
}
