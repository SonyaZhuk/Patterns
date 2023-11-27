package gof.designpatterns.creational.prototype.issues;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * иерархия классов, поддерживающих клонирование
 */
public class Book extends Issue {
    private String author;

    public Book(Integer id, String author, String name, int year) {
        super(id, name, year);
        this.author = author;
    }
}
