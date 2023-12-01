package gof.designpatterns.behavioral.strategy.ducks;

import gof.designpatterns.behavioral.strategy.ducks.aspects.quack.QuackBehavior;
import gof.designpatterns.behavioral.strategy.ducks.aspects.fly.FlyBehavior;
import gof.designpatterns.behavioral.strategy.ducks.aspects.fly.FlyNoWay;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        //quackBehavior = new Squeak();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
