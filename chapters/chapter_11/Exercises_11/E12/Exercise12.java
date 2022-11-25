package chapters.chapter_11.Exercises_11.E12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers");
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
            sum += list.get(i);
        }
        System.out.print(list.get(0)+"+"+list.get(1)+"+"+list.get(2)+"+"+list.get(3)+"+"+list.get(4)+" = ");
        System.out.print(sum);
    }
}
