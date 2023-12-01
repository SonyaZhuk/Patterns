package gof.designpatterns.behavioral.interpreter.math;

/**
 * соответствует более общепринятому выражению (4+7)*2-8 = 14
 */
public class InterpreterClient {
    public static void main(String[] args) {
        String expression = "8 2 7 4 + * -"; // expression in polska form
        Client interpreter = new Client(expression);
        System.out.println("[ " + expression + " ] = " + interpreter.calculate());
    }
}