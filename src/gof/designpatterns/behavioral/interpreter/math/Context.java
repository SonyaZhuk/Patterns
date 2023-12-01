package gof.designpatterns.behavioral.interpreter.math;

import java.util.ArrayDeque;


/**
 * В класс Context будут помещаться исходные числовые значения выражения,
 * а также результаты промежуточных вычислений и конечный результат.
 */
public class Context {
    private ArrayDeque<Integer> contextValues = new ArrayDeque<>();

    public Integer popValue() {
        return contextValues.pop();
    }
    public void pushValue(Integer value) {
        this.contextValues.push(value);
    }
}
