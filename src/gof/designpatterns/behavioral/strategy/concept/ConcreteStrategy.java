package gof.designpatterns.behavioral.strategy.concept;

public class ConcreteStrategy implements Strategy {
    public void algorithm() {
        System.out.println("Using concrete algorithm.");
    }
}
