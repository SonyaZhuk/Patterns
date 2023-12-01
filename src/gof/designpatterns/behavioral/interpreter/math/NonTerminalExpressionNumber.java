package gof.designpatterns.behavioral.interpreter.math;

public class NonTerminalExpressionNumber extends AbstractMathExpression {
    private int number;

    public NonTerminalExpressionNumber(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Context c) {
        c.pushValue(number);
    }
}