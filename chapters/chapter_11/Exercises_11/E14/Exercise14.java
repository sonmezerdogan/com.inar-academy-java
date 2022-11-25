package chapters.chapter_11.Exercises_11.E14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Integer[] integerList1 = createList();
        Integer[] integerList2 = createList();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(integerList1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(integerList2));

        ArrayList<Integer> listUnion = union(list1, list2);
        System.out.print("\nList1 : "+list1);
        System.out.print("\nList2 : "+list2);
        System.out.print("\nunitedlist : "+listUnion);
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static Integer[] createList() {
        int value = 5;
        Integer[] result = new Integer[value];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)(Math.random()* 100);
        }
        return result;
    }
}
