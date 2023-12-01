package gof.designpatterns.behavioral.iterator.session;

import java.util.HashMap;

public class StudentSession implements Aggregate {
    private HashMap<String, Integer> exams = new HashMap<String, Integer>();

    public CustomIterator createIterator() {
        CustomIterator iterator = new ExamsIterator(this);
        iterator.first();
        return iterator;
    }

    public void addExam(String name, Integer mark) {
        exams.put(name, mark);
    }

    public Integer getMark(String name) {
        return exams.get(name);
    }

    public HashMap<String, Integer> getExams() {
        return exams;
    }
}
