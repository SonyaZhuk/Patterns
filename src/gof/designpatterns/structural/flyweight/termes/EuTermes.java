package gof.designpatterns.structural.flyweight.termes;

import java.io.Serializable;

/**
 * flyweight (приспособленец)
 * разделение состояний на основе агрегирования # EuTermes.java
 * <p>
 * Основной задачей является грамотное разделение состояний на внутренне и внешнее.
 * Сами термиты представляются практически идентичными, но каждый из них располагается в конкретной точке пространства.
 */
public class EuTermes implements Serializable {
    private Termes ant;
    private int health;
    private float xCoord;
    private float yCoord;

    public EuTermes(String type, float xCoord, float yCoord, float zCoord) {
        this.ant = TermesFactory.getClassFromFactory(type);
        health = 180;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getXCoord() {
        return xCoord;
    }

    public void setXCoord(float xCoord) {
        this.xCoord = xCoord;
    }

    public float getYcoord() {
        return yCoord;
    }

    public void setYcoord(float ycoord) {
        this.yCoord = ycoord;
    }

    public void go() {
    }

    public void fight() {
    }
}