package gof.designpatterns.structural.flyweight.tree;

import java.time.*;

public interface Tree {
    void display(int x, int y);

    default boolean isWithinRange(LocalDate aDate) {
        Month month = aDate.getMonth();
        return (month.getValue() > 2) && (month.getValue() < 11);
    }
}