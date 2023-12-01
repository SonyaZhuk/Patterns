package gof.designpatterns.structural.composite.menuiterator;

import java.util.*;
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public MenuComponent next() {
        if (!hasNext()) return null;

        Iterator<MenuComponent> iterator = stack.peek();
        MenuComponent component = iterator.next();
        stack.push(component.createIterator());
        return component;
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        if (iterator.hasNext()) {
            return true;
        }
        stack.pop();
        return hasNext();
    }
}


