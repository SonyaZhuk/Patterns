package gof.designpatterns.behavioral.chainofresponsibility;

public class Task implements BaseInterface {

    private String message;

    public Task(String message) {
        this.message = message;
    }

    public String handleRequest() {
        System.out.println("message in Task: " + message);
        return message;
    }
}
