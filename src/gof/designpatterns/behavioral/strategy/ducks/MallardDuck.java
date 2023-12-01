package gof.designpatterns.behavioral.strategy.ducks;

import gof.designpatterns.behavioral.strategy.ducks.aspects.fly.FlyWithWings;
import gof.designpatterns.behavioral.strategy.ducks.aspects.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
