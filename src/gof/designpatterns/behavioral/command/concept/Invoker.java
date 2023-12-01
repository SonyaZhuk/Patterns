package gof.designpatterns.behavioral.command.concept;

import gof.designpatterns.behavioral.command.concept.ICommand;

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

