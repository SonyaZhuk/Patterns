package gof.designpatterns.behavioral.command.concept;


public class CommandOne implements ICommand {
    private Receiver receiver;
    public CommandOne(Receiver reciever) {
        this.receiver = reciever;
    }
    public void execute() {
        System.out.println("Determine connection between receiver and action");
        receiver.action(TypeCommand.ONE);
    }
}
