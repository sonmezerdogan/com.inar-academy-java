package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password consists of letters and digits:");
        String password = sc.nextLine();
        System.out.print(isValidPassword(password) ? "Valid password" : "Invalid password");
        ;

    }

    public static boolean isValidPassword(String password) {
        int cnt = 0;
        if (password.length() < 8) {
            return false;
        }
        for (int i = 1; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                cnt++;
            } else if (!Character.isLetter(password.charAt(i))) {
                return false;
            }
        }


        return cnt>=2;
    }
}
