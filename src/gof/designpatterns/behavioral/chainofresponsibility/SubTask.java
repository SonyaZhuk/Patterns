package gof.designpatterns.behavioral.chainofresponsibility;

public class SubTask implements BaseInterface {

    private String message;
    private Task root;

    public SubTask(Task root, String message) {
        this.root = root;
        this.message = message;
    }

    public String handleRequest() {
        System.out.println("message in SubTask: " + message);
        return (root == null) ? message : root.handleRequest();
    }
}
