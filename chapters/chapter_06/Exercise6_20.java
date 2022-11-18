package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string statement:");
        String str=sc.nextLine();
        String str1=str.toUpperCase();
        System.out.println("The number of letters in the"+str+" is "+countLetters(str1));


    }

    public static int countLetters(String s){
        int count=0;
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                count++;
            }
        }
        return count;
    }


}
