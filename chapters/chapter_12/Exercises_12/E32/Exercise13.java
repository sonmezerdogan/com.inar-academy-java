package chapters.chapter_12.Exercises_12.E32;

import java.io.File;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("wrong usage! Takes one argument and its file name");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("There is no such file");
            System.exit(2);
        }
        String str = "";
        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;

        try (
                Scanner input = new Scanner(System.in);
        ) {
            while (input.hasNext()) {
                str = input.nextLine();
                lineCount++;
                charCount += countChars(str);
                wordCount += countWords(str);
            }
        }
        System.out.println("Number of lines : " + lineCount + "\nNumber of chars : " + charCount + "\nNumber of words : " + wordCount);
    }
    public static int countChars(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
    public static int countWords(String str) {
        String[] array = str.split(" ");
        return array.length;
    }
}
