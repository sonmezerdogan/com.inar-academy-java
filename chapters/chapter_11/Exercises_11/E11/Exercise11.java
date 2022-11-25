package chapters.chapter_11.Exercises_11.E11;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Exercise11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.print("\nBefore sorting : ");
        System.out.print("\n"+list.toString());
        sort(list);
        System.out.print("\nThe numbers in increasing order are : ");
        System.out.print("\n"+ list.toString());

    }
}
