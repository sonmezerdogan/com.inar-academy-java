package chapters.chapter_11.Exercises_11.E10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    public MyStack() {

    }

    public MyStack(int capacity) {
        super(capacity);
    }


    public void push(Object o) {
        super.add(o);
    }

    public Object pop() {
        return super.remove(super.size() - 1);
    }

    public Object peek() {
        return super.get(super.size() - 1);
    }

    public int size() {
        return super.size();
    }

    public boolean isEmpty() {
        return super.size() == 0;
    }

    @Override
    public String toString() {
        return "Stack --> " + super.toString();
    }
}
