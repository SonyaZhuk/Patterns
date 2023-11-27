package gof.designpatterns.creational.prototype.issues;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * иерархия классов, поддерживающих клонирование
 */
public abstract class Issue implements Cloneable {
    private Integer id;
    private String name;
    private int year;

    public Issue(Integer id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    @Override
    protected Issue clone() {
        Issue cloned = null;
        try {
            cloned = (Issue) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
