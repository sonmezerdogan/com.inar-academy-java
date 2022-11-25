package chapters.chapter_11.Listing_11;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
                list.add(value);
            System.out.println(list.toString());
        }
        while (value != 0);
        for (int number: list)
            System.out.print(number+ " ");
    }


}
