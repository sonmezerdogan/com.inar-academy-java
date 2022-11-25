package chapters.chapter_11.Exercises_11.E07;

import java.util.ArrayList;

public class Exercise07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number= (int)(Math.random()*i);
            list.add(number);

        }
        System.out.println("Before shuffle : "+list);

        shuffle(list);
        System.out.println("After  shuffle : "+list.toString());
    }
    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}
