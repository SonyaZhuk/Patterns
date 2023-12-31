package gof.designpatterns.behavioral.templatemethod.barista;

import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook {
    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return (answer.toLowerCase().startsWith("y"));
    }
    private String getUserInput() {
        // get the user's response
        String answer = null;

        System.out.print("Would you like lemon with your tea (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }

        return (answer == null) ? "no" : answer;
    }
}
