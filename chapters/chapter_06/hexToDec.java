package chapters.chapter_06;

import java.util.Scanner;

public class hexToDec {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a hex number");
        String hexNumber= sc.nextLine();
        System.out.println("The decimal value for "+hexNumber+" is "+decimalFormOfHexNumber(hexNumber.toUpperCase()));
    }
    public static int decimalFormOfHexNumber(String hexNumber){
        int decimalValue=0;

        for(int i=0; i<hexNumber.length(); i++){
            char chHex=hexNumber.charAt(i);
            decimalValue=decimalValue*16+hexValueOfChar(chHex);
        }
        return decimalValue;
    }
    public static int hexValueOfChar(char ch){
        if(ch>='A' && ch<='F'){
            return ch-'A'+10;
        }else {
            return ch - '0';
        }

    }
}
