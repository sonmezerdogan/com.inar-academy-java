package chapters.chapter_06;

public class Exercise6_12_B {
    public static void main(String[] args) {
        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerLine = 10;
        printChars(ch1, ch2, numberPerLine);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        char ch = '1';
        int cnt = 0;
        while (ch <= 'Z') {
            System.out.print(ch + " ");
            ch++;
            cnt++;
            if (cnt % 10 == 0) {
                System.out.println();

            }
        }
    }
}
