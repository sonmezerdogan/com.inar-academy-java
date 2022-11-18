package chapters.chapter_10.Listing_10;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("If you ignore nonalphanumeric characters:\nis " +str+ " a palindrome?-->> "+
                isPalindrome(str));
        }
    public static boolean isPalindrome(String str) {
        String filteredStr= filterStr(str);
        String s2 = reverse(filteredStr);
        return s2.equals(filteredStr);
    }
    public static String filterStr(String str) {
        StringBuilder sB = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i))) {
                sB.append(str.charAt(i));
            }
        }
        return sB.toString();
    }
    public static String reverse(String str) {
        StringBuilder sB = new StringBuilder(str);
        return sB.reverse().toString();
    }
}
