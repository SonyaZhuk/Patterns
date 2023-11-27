package gof.designpatterns.creational.prototype.issues;

import java.util.List;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 */
public interface Client<T> {
    T cloneElementById(Integer id);

    List<T> cloneElements(Object... param);
}