package gof.designpatterns.structural.composite.concept;

/**
 * общий интерфейс древовидной структуры
 */
public interface Component {
    void operation();

    void add(Component c);

    void remove(Component c);

    Object getChild(int index);
}

