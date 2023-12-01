package gof.designpatterns.behavioral.command.concept;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 * <p>
 * демонстрация работы шаблона Command
 * <p>
 * Шаблон Command используется при:
 * — разделении источника запроса и его исполнителя;
 * — необходимости построения последовательности команд, порядок в которй определяет сам пользователь
 * в зависимости от своего желания или результатов выполнения предыдущей команды;
 * — необходимости отмены предыдущей команды;
 * — выполнении операций с транзакциями.
 */
public class RunnerClient {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Client client = new Client(receiver);
        ICommand commandOne = client.initCommand(TypeCommand.ONE);
        Invoker invokerOne = new Invoker(commandOne);
        invokerOne.invokeCommand();
        ICommand commandTwo = client.initCommand(TypeCommand.TWO);
        Invoker invokerTwo = new Invoker(commandTwo);
        invokerTwo.invokeCommand();
    }
}