package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and a character :");
        String s = sc.nextLine();
        char ch = s.charAt(s.length() - 1);
        s = s.substring(0, s.length() - 1);
        s = s.trim();
        System.out.print(count(s, ch));
    }

    public static int count(String str, char a){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(a==str.charAt(i)){
                count++;
            }
        }
        return count;
    }

}
