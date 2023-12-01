package gof.designpatterns.behavioral.templatemethod.list;

import java.util.AbstractList;
public class StringList extends AbstractList<String> {
    private String[] myList;

    StringList(String[] strings) {
        myList = strings;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }

    @Override
    public int size() {
        return myList.length;
    }
}