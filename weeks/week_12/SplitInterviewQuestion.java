package weeks.week_12;

import java.util.Scanner;

public class SplitInterviewQuestion {

    public static void main(String[] args) {

        deneme();
        findJavaInCV();

    }

    public static void deneme() {
        String s1 = "I love Inar Academy";
        /**
         * I
         * love
         * Inar
         * Academy
         */
        String[] arr = s1.split(" ");
        display(arr);

    }


    public static void findJavaInCV() {
        String cv = " JAVAOJAVAOJava ";
//        String a = cv.trim();
//        a.split("Java");
        String[] arr = cv.trim().toUpperCase().split("JAVA");

        //whitespace : space, tab, newLine
        /**
         * [0] - Tarik\n I have been working at Amazon for about 4 years.I am using
         * [1] - in my KILT project. The backend is developed by Using
         * [2] -  Spring
         */
//        SplitInterviewQuestion sq = new SplitInterviewQuestion();
//        sq.display(arr);
        display(arr);
        int count = arr.length;
        System.out.println(count);

        Scanner input = new Scanner(System.in);
    }

    private static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

