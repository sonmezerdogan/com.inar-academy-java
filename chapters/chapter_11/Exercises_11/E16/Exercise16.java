package chapters.chapter_11.Exercises_11.E16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int) (Math.random() * 50);
        int num2 = (int) (Math.random() * 50);
        System.out.println("What is " + num1 + "+" + num2 + " ?");
        int result = (num1 + num2);
        int answer = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (answer != result) {
            if (list.contains(answer)) {
                System.out.println("You've already entered " + answer);
                System.out.print("Try again. What is " + num1 + " + " + num2 + "? ");
            } else {
                list.add(answer);
                System.out.print("Wrong answer. Try again. What is " + num1 + " + " + num2 + "? ");
            }
            answer = input.nextInt();
        }
        input.close();
        System.out.println("You got it! "+ num1 + " + " + num2 + "= "+result);
        System.out.println("The wrong answers you entered :"+list);
    }

}
