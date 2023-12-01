package gof.designpatterns.behavioral.strategy.ducks;

import gof.designpatterns.behavioral.strategy.ducks.aspects.quack.QuackBehavior;
import gof.designpatterns.behavioral.strategy.ducks.aspects.fly.FlyBehavior;
import gof.designpatterns.behavioral.strategy.ducks.aspects.fly.FlyRocketPowered;

public class MiniDuckClient {
 
	public static void main(String[] args) {

		MallardDuck mallard = new MallardDuck();
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
