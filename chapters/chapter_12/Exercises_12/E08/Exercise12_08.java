package chapters.chapter_12.Exercises_12.E08;

import java.util.Scanner;

public class Exercise12_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter a hex number");
            String hexString = input.nextLine();
            System.out.println(hexString + "(" +hexToDecimal(hexString) + ")" + " is a valid hex string ");

    }
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (checkHexChar(hexChar)) {
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            } else {
                throw new HexFormatException(hex);
            }

        }
        return decimalValue;
    }

    static boolean checkHexChar(char ch) {
        return ch >= '0' && ch <= 'F';
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else { // ch is '0', '1', ..., or '9'
            return ch - '0';
        }

    }
}
