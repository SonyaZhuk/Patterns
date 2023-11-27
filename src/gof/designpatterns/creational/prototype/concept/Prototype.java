package gof.designpatterns.creational.prototype.concept;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * def: used when we have an instance of the class (prototype)
 * and we’d like to create new objects by just copying the prototype.
 *
 * определение интерфейса для классов, поддерживающих прототипирование
 */
public interface Prototype {
   Prototype clonePrototype();
}

