package gof.designpatterns.behavioral.iterator.transition;

import java.util.Iterator;

public interface Menu {
    Iterator<?> createIterator();
}
