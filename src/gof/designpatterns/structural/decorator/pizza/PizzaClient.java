package gof.designpatterns.structural.decorator.pizza;

public class PizzaClient {

    public static void main(String args[]) {
        Pizza pizza = new ThincrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(cheesePizza);

        System.out.println(greekPizza.getDescription()
                + " $" + greekPizza.cost());
    }
}
