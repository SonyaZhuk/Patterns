package gof.designpatterns.creational.prototype.monster;

public class Dragon extends Monster {

    public Dragon(String name, boolean hasWings) {
        super(name);
        this.hasWings = hasWings;
        this.canBreatheFire = true;
    }

    // Each concrete monster could determine how best to clone itself
    public Monster copy() throws CloneNotSupportedException {
        return (Monster) this.clone();
    }
}