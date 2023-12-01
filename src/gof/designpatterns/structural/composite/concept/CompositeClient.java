package gof.designpatterns.structural.composite.concept;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * запуск процесса организации Composite
 * <p>
 * Предоставляет возможность строить сложные объекты с использованием рекурсии. Позволяет рассматривать объект как
 * комбинацию более простых в целом составляющих древовидную структуру. Составной элемент представляет собой набор из
 * частей с аналогичной природой. Часть целого в таком случае представляется как набор более мелких частей, и так
 * до тех пор, пока не будет выделена некая элементарная часть. Элементарная часть уже неделима.
 * <p>
 * Интерфейс Component задает интерфейс для всех составных объектов.
 * У интерфейса Component обычно существует одна или несколько реализаций типа Leaf,
 * не имеющие потомков и описывающие неделимые элементы структуры. Тип Composite хранит
 * составные и неделимые компоненты и определяет их поведение. Способ организации и поведения
 * Composite зависит от задач, решаемых этим самым составным объектом.
 */
public class CompositeClient {
    public static void main(String[] args) {
        Component composite = new Composite();
        Component leaf = new Leaf();
        leaf.add(composite);
        composite.add(leaf);
        Client client = new Client(composite);
        client.execute();
    }
}
