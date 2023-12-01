package gof.designpatterns.behavioral.visitor.renting;

/**
 * реализация иерархии сущностей с настраиваемым поведением
 */
public abstract class Renting implements Visitable {
    private int term;

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
