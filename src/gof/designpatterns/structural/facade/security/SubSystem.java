package gof.designpatterns.structural.facade.security;

public class SubSystem {
    public void parse() {
        System.out.println("Parsing");
    }

    public void createNode() {
        System.out.println("Creating program node");
    }
}