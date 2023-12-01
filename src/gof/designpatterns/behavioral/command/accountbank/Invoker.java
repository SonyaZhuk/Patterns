package gof.designpatterns.behavioral.command.accountbank;

/**
 * реализация класса Invoker, который передает команду для выполнения, ничего о ней не зная
 */
public class Invoker {
    private ICommand mCommand;

    public Invoker(ICommand command) {
        mCommand = command;
    }

    public void invokeCommand() {
        System.out.println("Refer to command for execution");
        mCommand.execute();
    }
}

