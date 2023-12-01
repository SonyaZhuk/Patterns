package gof.designpatterns.behavioral.command.accountbank;

public class CreditingCommand implements ICommand {
    private Receiver receiver;

    public CreditingCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action(CommandTypes.CREDITING);
    }
}
