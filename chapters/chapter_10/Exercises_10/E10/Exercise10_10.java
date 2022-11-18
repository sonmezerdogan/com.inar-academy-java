package chapters.chapter_10.Exercises_10.E10;

public class Exercise10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i <= 20 ; i++) {
            queue.enqueue(i);
        }
        int size = queue.getSize();
        for (int i = 0; i < size; i++) {
            System.out.println(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
