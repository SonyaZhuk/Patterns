package gof.designpatterns.behavioral.strategy.ducks.aspects.fly;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
