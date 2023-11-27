package gof.designpatterns.creational.prototype.issues;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * иерархия классов, поддерживающих клонирование
 */
public class Magazine extends Issue {
    private int number;
    public Magazine(Integer id, int number, String name , int year) {
        super(id, name, year);
        this.number = number;
    }
}
