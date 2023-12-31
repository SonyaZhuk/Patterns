package gof.designpatterns.structural.flyweight.termes;

/**
 * иерархия термитов # AbstarctAnt.java # Termes.java # Worker.java #  Warrior.java # TermesType.java
 */
public abstract class AbstarctAnt {
    protected int strength;
    protected int dexterity;
    protected int speed;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {

        this.dexterity = dexterity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}