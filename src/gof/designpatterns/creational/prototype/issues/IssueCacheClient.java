package gof.designpatterns.creational.prototype.issues;

import java.util.ArrayList;
import java.util.List;

/**
 * Design Patterns: Elements of Reusable Object-Oriented Software
 * by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
 *
 * Класс IssueCacheClient представляет конкретные реализации процессов клонирования.
 */
public class IssueCacheClient implements Client<Issue> {
    // Prototype
    private List<Issue> cache;

    public IssueCacheClient() {
        cache = new ArrayList<>();
    }

    public IssueCacheClient(List<Issue> issueList) {
        this.cache = issueList;
    }

    @Override
    public Issue cloneElementById(Integer id) {
        for (Issue issue : cache) {
            if (issue.getId() == id) {
                return issue.clone();
            }
        }
        throw new IllegalArgumentException("illegal ID " + id);
    }

    @Override
    public List<Issue> cloneElements(Object... param) {
        ArrayList<Issue> list = new ArrayList<>();  // реализация поиска, клонирования и организации новой коллекции
        return list;
    }
}