package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string statement:");
        String str = sc.nextLine();
        String str1 = str.toUpperCase();
        for (int i = 0; i < str1.length(); i++) {
            if (!(str1.charAt(i)<='Z' && str1.charAt(i)>='A')) {
                System.out.print((str1.charAt(i)));
            } else {
                System.out.print(getNumber(str1.charAt(i)));
            }
        }
    }
    public static int getNumber(char ch) {
        if (ch == 'A' || ch == 'B' || ch == 'C') {
            return 2;
        } else if (ch == 'D' || ch == 'E' || ch == 'F') {
            return 3;
        } else if (ch == 'G' || ch == 'H' || ch == 'I') {
            return 4;
        } else if (ch == 'J' || ch == 'K' || ch == 'L') {
            return 5;
        } else if (ch == 'M' || ch == 'N' || ch == 'O') {
            return 6;
        } else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
            return 7;
        } else if (ch == 'T' || ch == 'U' || ch == 'V') {
            return 8;
        } else {
            return 9;
        }
    }
}

