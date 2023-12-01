package gof.designpatterns.behavioral.strategy.ducks.aspects.quack;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
