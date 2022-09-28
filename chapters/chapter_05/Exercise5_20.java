package chapters.chapter_05;

public class Exercise5_20 {
    public static void main(String[]args) {
        int cnt = 0;

        for (int i = 2; i <= 1000; i++) {
            if (i == 2 || i == 3 || i == 5) {
                System.out.print(i + " ");
                cnt++;
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
                cnt++;
                if (cnt % 8 == 0) {
                    System.out.println();
                }

            }
        }
    }


}
