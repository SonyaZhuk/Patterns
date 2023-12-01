package gof.designpatterns.structural.flyweight.termes;

import java.io.Serializable;

public class Warrior extends Termes implements Serializable {
    public Warrior() {
        strength = 10;
        dexterity = 4;
        speed = 6;
    }
}
