package gof.designpatterns.behavioral.iterator.session;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * Ниже приведена реализация итератора для класса StudentSession, инкапсулирующего в виде карты HashMap результаты
 * студенческой сеесии. Шаблон Iterator представлен в классическом виде, но с использованием методов итератора,
 * предоставленного стандартными библиотеками языка Java.
 */
public class IteratorClient {
    public static void main(String[] args) {
        StudentSession session = new StudentSession();
        session.addExam("MA", 9);
        session.addExam("TFCV", 10);
        session.addExam("DS", 8);
        System.out.println("The list of exams: ");
        CustomIterator iterator = session.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
