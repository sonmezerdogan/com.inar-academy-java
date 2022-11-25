package chapters.chapter_11.Exercises_11.E04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getArrayList();
        Integer numMax = max(list);
        System.out.println("The maximum number in the list is : " + numMax);
        System.out.println("The size of the list is : " + list.size());
    }
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        } else
            return java.util.Collections.max(list);
    }
    public static ArrayList<Integer> getArrayList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers (input ends with 0): ");
        int value = input.nextInt();
        while (value != 0){
            list.add(value);
            value = input.nextInt();
        }
        return list;
    }



}

