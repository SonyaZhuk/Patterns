package gof.designpatterns.behavioral.strategy.ducks;

import gof.designpatterns.behavioral.strategy.ducks.aspects.fly.FlyNoWay;
import gof.designpatterns.behavioral.strategy.ducks.aspects.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
