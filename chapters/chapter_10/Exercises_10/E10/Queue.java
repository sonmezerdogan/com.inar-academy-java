package chapters.chapter_10.Exercises_10.E10;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements= new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void enqueue(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = value;
        size++;
    }
    public int dequeue() {
        int number = elements[0];
        for (int i = 1; i < size; i++) {
            elements[i-1] = elements[i];
        }
        size--;
        return number;
    }
    public boolean empty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
}
