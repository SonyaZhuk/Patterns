package gof.designpatterns.behavioral.strategy.ducks.aspects.quack;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
