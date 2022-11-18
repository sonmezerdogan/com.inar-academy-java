package chapters.chapter_06;

public class Exercise6_12 {
    public static void main(String[] args) {
        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerLine = 10;

        printChars(ch1, ch2, numberPerLine);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int cnt = 0;

        for (int i = 49; i <= 90; i++) {

            System.out.print((char) i + " ");
            cnt++;
            if (cnt % numberPerLine == 0) {
                System.out.println();

            }
        }
    }
}
