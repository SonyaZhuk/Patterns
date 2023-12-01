package gof.designpatterns.structural.flyweight.termes;

import java.io.Serializable;

public class Worker extends Termes implements Serializable {
    public Worker() {
        strength = 6;
        dexterity = 9;
        speed = 10;
    }
}