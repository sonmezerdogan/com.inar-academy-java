package chapters.chapter_07;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str= sc.nextLine();
        char[] s= str.toCharArray();
        char[] sReverse= sOnMirror(s);
        System.out.println(sReverse);
    }
    public static char[] sOnMirror(char[] s){
        char[] sReverse= new char[s.length];
        for (int i = 0, j=sReverse.length-1; i <s.length ; i++, j--) {
            sReverse[j]=s[i];

        }
        return sReverse;
    }
}
