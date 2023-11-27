package gof.designpatterns.creational.builder.parser;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * Хорошим примером реализации шаблона Builder служит процесс создания объекта на основе информации,
 * извлекаемой из XML-документа различными парсерами.
 */
public class ParserClient {

    public static void main(String args[]) {
        User e1 = Director.createUser(new DOMBuilder());
        User e2 = Director.createUser(new SAXBuilder());
    }
}
