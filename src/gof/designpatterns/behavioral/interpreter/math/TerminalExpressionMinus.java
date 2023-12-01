package gof.designpatterns.behavioral.interpreter.math;

public class TerminalExpressionMinus extends AbstractMathExpression {
    @Override
    public void interpret(Context c) {
        c.pushValue(c.popValue() - c.popValue());
    }
}
