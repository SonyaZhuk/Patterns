package gof.designpatterns.creational.prototype.issues;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 */

import java.util.ArrayList;

public class PrototypeClient {

    public static void main(String[] args) {
        ArrayList<Issue> issueList = new ArrayList<>() {
            {
                this.add(new Book(615, "Steve McConnell", "Code Complete", 2012));
                this.add(new Book(453, "Bruce Eckel", "Thinking in Java", 2006));
                this.add(new Book(721, "Joshua Bloch", "Effective Java", 2008));
                this.add(new Magazine(1009, 9, "PC Magazine", 2012));
            }
        };

        IssueCacheClient cache = new IssueCacheClient(issueList);
        Issue copy = cache.cloneElementById(453);

        System.out.println(issueList);
        System.out.println(copy);
    }
}