package gof.designpatterns.behavioral.chainofresponsibility;

public class Question implements BaseInterface {
    private String message;
    private SubTask parent;

    public Question(SubTask parent, String message) {
        this.parent = parent;
        this.message = message;
    }

    public String handleRequest() {
        System.out.println("message in Question: " + message);

        return (parent == null) ?
                message : parent.handleRequest();
    }
}
