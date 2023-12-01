package gof.designpatterns.behavioral.iterator.session;

public class ExamsIterator implements CustomIterator {
    private StudentSession session;

    private String current;
    private java.util.Iterator<String> iterator;
    private boolean done;

    public ExamsIterator(StudentSession session) {
        this.session = session;
    }

    public Object currentItem() {
        return current;
    }

    public void first() {
        iterator = session.getExams().keySet().iterator();
        next();
    }

    public boolean isDone() {
        return done;
    }

    public void next() {
        if (iterator.hasNext()) {
            current = iterator.next();
        } else {
            done = true;
        }
    }
}
