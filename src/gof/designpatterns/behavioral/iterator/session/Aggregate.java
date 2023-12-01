package gof.designpatterns.behavioral.iterator.session;

public interface Aggregate {
    CustomIterator createIterator();
}