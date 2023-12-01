package gof.designpatterns.behavioral.interpreter.math;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * В классе Client происходит синтаксический разбор исходной задачи (выражения) и в зависимости от результатов
 * анализа инициализация соответствующих терминальных объектов и организация их в виде списка.
 * Метод calculate() отвечает за сборку окончательного решения на основе выполнения элементарных задач,
 * которые инициируются запуском метода interpret(), соответствующего извлеченному из списка терминальному объекту.
 * <p>
 * реализация синтаксической логики Interpreter и запуск процесса
 */
public class Client {
    private ArrayList<AbstractMathExpression> listExpression;

    public Client(String expression) {
        listExpression = new ArrayList<>();
        parse(expression);
    }

    private void parse(String expression) {
        for (String lexeme : expression.split("\\p{Blank}+")) {
            if (lexeme.isEmpty()) {
                continue;
            }

            char temp = lexeme.charAt(0);
            switch (temp) {
                case '+':
                    listExpression.add(new TerminalExpressionPlus());
                    break;
                case '-':
                    listExpression.add(new TerminalExpressionMinus());
                    break;
                case '*':
                    listExpression.add(new TerminalExpressionMultiply());
                    break;
                case '/':
                    listExpression.add(new TerminalExpressionDivide());
                    break;
                default:
                    Scanner scan = new Scanner(lexeme);
                    if (scan.hasNextInt()) {
                        listExpression.add(new NonTerminalExpressionNumber(scan.nextInt()));
                    }
            }
        }
    }

    public Number calculate() {
        Context context = new Context();
        for (AbstractMathExpression terminal : listExpression) {
            terminal.interpret(context);
        }
        return context.popValue();
    }
}
