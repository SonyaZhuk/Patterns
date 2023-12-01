package gof.designpatterns.behavioral.strategy.ducks;

import gof.designpatterns.behavioral.strategy.ducks.aspects.quack.MuteQuack;
import gof.designpatterns.behavioral.strategy.ducks.aspects.fly.FlyNoWay;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
