package gof.designpatterns.structural.decorator.concept;

/**
 * абстракция декоратора и конкретный декорируемый тип
 */
public abstract class Decorator implements Component {
    public static Component component;

    public void operation() {
        // more code
    }
}