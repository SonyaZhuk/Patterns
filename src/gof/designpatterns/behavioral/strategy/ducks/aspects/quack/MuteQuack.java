package gof.designpatterns.behavioral.strategy.ducks.aspects.quack;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
